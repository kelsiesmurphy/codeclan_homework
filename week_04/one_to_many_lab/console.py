from models.book import Book
from models.author import Author

from repositories import book_repository
from repositories import author_repository


book_repository.delete_all()
author_repository.delete_all()

author_1 = Author("J.K. Rowling")
author_repository.save(author_1)

author_2 = Author("Suzanne Collins")
author_repository.save(author_2)

author_repository.select_all()

book_1 = Book("Harry Potter and the Philosophers Stone", author_1, "https://m.media-amazon.com/images/I/51QlIOsRf2L._SY291_BO1,204,203,200_QL40_ML2_.jpg")
book_repository.save(book_1)

book_2 = Book("The Hunger Games", author_2, "https://upload.wikimedia.org/wikipedia/en/d/dc/The_Hunger_Games.jpg")
book_repository.save(book_2)

book_3 = Book("Harry Potter and the Goblet of Fire", author_1, "https://m.media-amazon.com/images/I/41AF6KHRGML._SY291_BO1,204,203,200_QL40_ML2_.jpg")
book_repository.save(book_3)

book_4 = Book("The Hunger Games: Catching Fire", author_2, "https://d3ddkgxe55ca6c.cloudfront.net/assets/t1622557249/a/57/29/143073-ml-869501.jpg")
book_repository.save(book_4)

# breakpoint()
