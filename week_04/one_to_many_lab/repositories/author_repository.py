from db.run_sql import run_sql

from models.author import Author


def select_all():
    selected_authors = []
    sql = "SELECT * FROM authors"
    results = run_sql(sql)
    for row in results:
        author = Author(row['name'], row['author_id'])
        selected_authors.append(author)
    return selected_authors


def select(author_id):
    sql = "SELECT * FROM authors WHERE author_id=%s"
    values = [author_id]
    result = run_sql(sql, values)[0]
    if result is not None:
        author = Author(result['name'], result['author_id'])
    return author


def save(author):
    sql = "INSERT INTO authors (name) VALUES (%s) RETURNING *"
    values = [author.name]
    results = run_sql(sql, values)
    author_id = results[0]['author_id']
    author.author_id = author_id
    return author


def update(author):
    sql = "UPDATE authors SET (name) = (%s) WHERE author_id = %s"
    values = [author.name]
    run_sql(sql, values)


def delete(author_id):
    sql = "DELETE FROM books WHERE author_id=%s"
    values = [author_id]
    run_sql(sql, values)


def delete_all():
    sql = "DELETE FROM authors"
    run_sql(sql)