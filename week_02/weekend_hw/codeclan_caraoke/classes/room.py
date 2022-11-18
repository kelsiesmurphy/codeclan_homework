class Room:
    def __init__(self, name, no_of_spaces, entry_fee):
        self.name = name
        self.no_of_spaces = no_of_spaces
        self.entry_fee = entry_fee
        self.songs_list = []
        self.checked_in_guests = []

    def check_in(self, guest):
        if len(self.checked_in_guests) < self.no_of_spaces and guest.money >= self.entry_fee:
            self.checked_in_guests.append(guest)
            guest.money -= self.entry_fee
        else:
            return "Cannot get this room"

    def check_out(self, guest):
        self.checked_in_guests.remove(guest)

    def add_song(self, song):
        self.songs_list.append(song)

    def remove_song(self, song):
        self.songs_list.remove(song)

    def favourite_song_on_playlist(self, guest):
        if guest.favourite_song in self.songs_list:
            return "Whoo!"
        else:
            return "Booo!"