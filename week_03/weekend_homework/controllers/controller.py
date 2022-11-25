from app import app
from flask import render_template, request
from models.all_books import all_books, add_new_book, get_book, remove_book
from models.book import Book

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/all_books")
def all_orders():
    return render_template("all_books.html", all_books=all_books)

@app.route("/all_books/<int:book_index>")
def show_book(book_index):
    book_selection = get_book(book_index)
    return render_template("book.html", book=book_selection)

@app.route("/all_books/new")
def add_book():
    return render_template("create_book.html")

@app.route("/all_books", methods=["POST"])
def save_book():
    form_data = request.form
    book_name = form_data["title"]
    book_author = form_data["author"]
    book_genre = form_data["genre"]
    book_checked_out = form_data["checked_out"]
    new_book = Book(book_name, book_author, book_genre, book_checked_out)
    add_new_book(new_book)
    return render_template("all_books.html", all_books=all_books)

@app.route("/all_books/remove_book")
def go_to_remove_book():
    return render_template("remove_book.html", all_books=all_books)

@app.route("/all_books/remove_book", methods=["POST"])
def delete_book():
    form_data = request.form
    book_to_remove = form_data["books"]
    for book in all_books:
        if book.title == book_to_remove:
            remove_book(book)
    return render_template("all_books.html", all_books=all_books)