## Class Diagram
```mermaid
classDiagram

class Book {
    title:str
    author:author
    book_id:serial
    view()
    delete()
    create()
    save()
    select_all()
    delete_all()
    edit()
    update()
}

class Author {
    name:str
    author_id:serial
    view()
    delete()
    save()
    select_all()
    delete_all()
}

Author --> Book
```

## Entity Relationship Diagram
```mermaid
erDiagram
    BOOKS }|--|| AUTHORS : references
    BOOKS {
        VARCHAR title
        book_id serial
        author_id int
    }
    AUTHORS {
        VARCHAR name
        author_id serial
    }
```