from db.run_sql import run_sql

from models.book import Book
from repositories import author_repository


def select_all():
    selected_books = []
    sql = "SELECT * FROM books"
    results = run_sql(sql)
    for row in results:
        author = author_repository.select(row['author_id'])
        book = Book(row['title'], author, row['author_id'])
        selected_books.append(book)
    return selected_books


def select(book_id):
    sql = "SELECT * FROM books WHERE id=%s"
    values = [book_id]
    result = run_sql(sql, values)[0]
    if result is not None:
        author = author_repository.select(result['author_id'])
        book = Book(result['title'], author, result['id'])
    return book


def save(book):
    sql = "INSERT INTO books (title, author_id) VALUES (%s, %s) RETURNING *"
    values = [book.title, book.author.author_id]
    results = run_sql(sql, values)
    book_id = results[0]['id']
    book.book_id = book_id
    return book


def update(book):
    sql = "UPDATE books SET (title, author) = (%s, %s) WHERE id = %s"
    values = [book.title, book.author.id]
    run_sql(sql, values)


def delete(book_id):
    sql = "DELETE FROM books WHERE id=%s"
    values = [book_id]
    run_sql(sql, values)


def delete_all():
    sql = "DELETE FROM books"
    run_sql(sql)
