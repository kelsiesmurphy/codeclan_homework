from models.author import Author
from models.book import Book

from repositories import author_repository, book_repository

author_repository.delete_all()
book_repository.delete_all()

author_1 = Author("J.K. Rowling")
author_repository.save(author_1)

author_2 = Author("Suzanne Collins")
author_repository.save(author_2)


book_1 = Book("Harry Potter and the Philosophers Stone", author_1)
book_repository.save(book_1)

book_2 = Book("The Hunger Games", author_1)
book_repository.save(book_2)

book_3 = Book("Harry Potter and the Goblet of Fire", author_2)
book_repository.save(book_3)

book_4 = Book("The Hunger Games: Catching Fire", author_1)
book_repository.save(book_4)

# breakpoint()
