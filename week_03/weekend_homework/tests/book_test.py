import unittest
from models.all_books import *
from models.book import Book

class TestBook(unittest.TestCase):
    # @unittest.skip("delete this line to run the test")
    def test_book(self):
        self.assertEqual("Growth Mindset", book1.title)

    def test_add_book(self):
        book = Book("JavaScript and jQuery", "Jon Duckett", "Web Development", True)
        add_new_book(book)
        self.assertEqual(4, get_book_count())
