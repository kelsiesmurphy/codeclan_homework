from flask import Flask
from controllers.books_controller import book_blueprint

app = Flask(__name__)
app.register_blueprint(book_blueprint)

if __name__ == '__main__':
    app.run()
