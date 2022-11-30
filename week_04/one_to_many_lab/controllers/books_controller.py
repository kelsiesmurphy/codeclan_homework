from flask import render_template, redirect, request, Blueprint
from repositories import book_repository, author_repository
from models.book import Book

book_blueprint = Blueprint("tasks", __name__)

# HOME INDEX
# GET '/'
@book_blueprint.route('/')
def home():
    return render_template('index.html')


# BOOKS INDEX
# GET '/books'
@book_blueprint.route('/books')
def books():
    books = book_repository.select_all()
    return render_template('/books/index.html', books=books)


# CREATE BOOK
# GET '/books/create'
@book_blueprint.route('/books/create')
def create_book():
    authors = author_repository.select_all
    return render_template('/books/create.html', authors=authors)


# SAVE BOOK
# POST '/books'
@book_blueprint.route('/books', methods=['POST'])
def save_book():
    title = request.form['title']
    author_id = request.form['id']
    author = author_repository.select(author_id)
    
    book = Book(title, author)
    book_repository.save(book)
    return redirect('/books')


# SHOW BOOK
# GET '/books/<id>'
@book_blueprint.route('/books/<int:book_id>')
def show_book(book_id):
    book = book_repository.select(book_id)
    return render_template('/books/book.html', book=book)


# EDIT BOOK
# GET '/books/<id>/edit
@book_blueprint.route('/books/<int:book_id>/edit')
def edit_book(book_id):
    book = book_repository.select(book_id)
    authors = author_repository.select_all()
    return render_template('/books/edit.html', book=book, authors=authors)


# UPDATE BOOK
# PUT /books/<id>
@book_blueprint.route('/books/<int:book_id>/edit', methods=['POST'])
def update_book(book_id):
    title = request.form['title']
    author_id = request.form['id']
    author = author_repository.select(author_id)
    
    updated_book = Book(title, author, book_id)
    book_repository.update(updated_book)
    return redirect(f'/books/{updated_book.id}')


# DELETE BOOK
# DELETE '/books/<id>/delete'
@book_blueprint.route('/books/<int:book_id>/delete')
def delete_book(book_id):
    book_repository.delete(book_id)
    return redirect('/books')