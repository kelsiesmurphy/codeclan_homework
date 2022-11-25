from models.book import Book

book1 = Book("Growth Mindset", "Carol Dweck", "Self Development", True)
book2 = Book("HTML & CSS", "Jon Duckett", "Web Development", False)
book3 = Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", "Development", True)

all_books = [book1, book2, book3]

def get_book(book_index):
    return all_books[book_index]

def get_book_count():
    return len(all_books)

def add_new_book(new_book):
    all_books.append(new_book)

def remove_book(book):
    all_books.remove(book)