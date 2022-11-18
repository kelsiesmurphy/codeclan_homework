import unittest

from classes.guest import *
from classes.room import *
from classes.song import *

class TestRoom(unittest.TestCase):
    def setUp(self):
        self.guest1 = Guest("Jake", 50)
        self.guest2 = Guest("Jill", 60)

        self.room1 = Room("Room 1", 5, 20)
        self.room2 = Room("Room 2", 5, 30)

        self.song1 = Song("Uno")
        self.song2 = Song("Dos")


    # @unittest.skip("delete this line to run the test")
    def room_exists(self):
        self.assertEqual(20, self.room1.entry_fee)