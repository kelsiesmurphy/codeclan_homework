# Diagram for Codeclan Careoke

```mermaid
classDiagram

class Room {
    name: str
    songs_list: List
    checked_in_guests: List
    no_of_spaces: int
    entry_fee: int
    check_in()
    check_out()
    add_song()
    remove_song()
}

class Song {
    name: str
}

class Guest {
    name: str
    money: int
}

Room -- Song
Room -- Guest

```