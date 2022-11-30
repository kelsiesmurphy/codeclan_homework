DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS authors;



CREATE TABLE authors (
    author_id SERIAL PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE books (
    book_id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    author_id INT NOT NULL REFERENCES authors(author_id)
);

