import unittest

from classes.guest import *
from classes.room import *
from classes.song import *

class TestRoom(unittest.TestCase):
    def setUp(self):
        self.room1 = Room("Room 1", 5, 20)
        self.room2 = Room("Room 2", 1, 30)

        self.song1 = Song("Uno")
        self.song2 = Song("Dos")

        self.guest1 = Guest("Jake", 50, self.song1)
        self.guest2 = Guest("Jill", 60, self.song2)


    # @unittest.skip("delete this line to run the test")
    def test_room_exists(self):
        self.assertEqual(20, self.room1.entry_fee)

    # @unittest.skip("delete this line to run the test")
    def test_guest_exists(self):
        self.assertEqual("Jake", self.guest1.name)

    # @unittest.skip("delete this line to run the test")
    def test_song_exists(self):
        self.assertEqual("Uno", self.song1.name)


    # @unittest.skip("delete this line to run the test")
    def test_check_in_one_guest(self):
        self.room1.check_in(self.guest1)
        self.assertEqual(1, len(self.room1.checked_in_guests))

    # @unittest.skip("delete this line to run the test")
    def test_check_in_two_guests(self):
        self.room1.check_in(self.guest1)
        self.room1.check_in(self.guest2)
        self.assertEqual(2, len(self.room1.checked_in_guests))

    # @unittest.skip("delete this line to run the test")
    def test_check_in_more_guests_than_available(self):
        self.room2.check_in(self.guest1)
        self.assertEqual("Cannot get this room", self.room2.check_in(self.guest2))

    # @unittest.skip("delete this line to run the test")
    def test_check_out_one_guest(self):
        self.room1.check_in(self.guest1)
        self.room1.check_in(self.guest2) # Room should have two guests checked in
        self.room1.check_out(self.guest2) # Room should have one guest checked in now
        self.assertEqual(1, len(self.room1.checked_in_guests))


    # @unittest.skip("delete this line to run the test")
    def test_add_song_to_room(self):
        self.room1.add_song(self.song1)
        self.assertEqual(1, len(self.room1.songs_list))

    # @unittest.skip("delete this line to run the test")
    def test_add_song_to_room(self):
        self.room1.add_song(self.song1)
        self.room1.add_song(self.song2)
        self.assertEqual(2, len(self.room1.songs_list))
    
    # @unittest.skip("delete this line to run the test")
    def test_remove_song_from_room(self):
        self.room1.add_song(self.song1)
        self.room1.add_song(self.song2)
        self.room1.remove_song(self.song1)
        self.assertEqual(1, len(self.room1.songs_list))


    # -------- ADVANCED EXTENSIONS ---------

    # @unittest.skip("delete this line to run the test")
    def test_favourite_song_is_on_playlist(self):
        self.room1.add_song(self.song1)
        self.room1.add_song(self.song2)
        self.assertEqual("Whoo!", self.room1.favourite_song_on_playlist(self.guest1))

    # @unittest.skip("delete this line to run the test")
    def test_favourite_song_is_not_on_playlist(self):
        self.room2.add_song(self.song1)
        self.assertEqual("Booo!", self.room2.favourite_song_on_playlist(self.guest2)) # guest2's favourite song is song 2, which is not in playlist


    # @unittest.skip("delete this line to run the test")
    def test_guest_can_afford_room(self):
        self.room1.check_in(self.guest1) # room1 costs £20, guest1 has £50
        self.assertEqual(30, self.guest1.money)

    # @unittest.skip("delete this line to run the test")
    def test_guest_cannot_afford_room(self):
        self.guest2 = Guest("Jill", 20, self.song2) # Assigns guest2 new money value
        self.assertEqual("Cannot get this room", self.room2.check_in(self.guest2))