const assert = require('assert');
const Park = require('../models/park.js');
const Dinosaur = require('../models/dinosaur.js');

describe('Park', function() {

  beforeEach(function () {
    // Create three dinosaurs to add to park
    dinosaur1 = new Dinosaur('t-rex', 'carnivore', 50);
    dinosaur2 = new Dinosaur('diplodocus', 'herbivore', 20);
    dinosaur3 = new Dinosaur('deinocheirus', 'omnivore', 30);
    // Create the park
    park = new Park('Jurassic Park', 40, [dinosaur1, dinosaur2, dinosaur3]);
  })

  it('should have a name', function(){
    const actual = park.name;
    assert.strictEqual(actual, 'Jurassic Park');
  });

  it('should have a ticket price', function(){
    const actual = park.ticketPrice;
    assert.strictEqual(actual, 40);
  });

  it('should have a collection of dinosaurs', function(){
    const actual = park.dinosaurCollection;
    assert.deepStrictEqual(actual, [dinosaur1, dinosaur2, dinosaur3]);
  });

  it('should be able to add a dinosaur to its collection', function(){
    // Add a fourth dinosaur to be added to collection
    dinosaur4 = new Dinosaur('avimimus', 'omnivore', 10);
    park.addDinosaur(dinosaur4);

    const actual = park.dinosaurCollection;
    assert.deepStrictEqual(actual, [dinosaur1, dinosaur2, dinosaur3, dinosaur4]);
  });

  it('should be able to remove a dinosaur from its collection', function(){
    park.removeDinosaur(dinosaur1);

    const actual = park.dinosaurCollection;
    assert.deepStrictEqual(actual, [dinosaur2, dinosaur3]);
  });

  it('should be able to find the dinosaur that attracts the most visitors', function(){
    popularDino = park.dinoWithMostVisitors();

    actual = popularDino.species;
    assert.strictEqual(actual, 't-rex');
  });

  it('should be able to find all dinosaurs of a particular species', function(){
    // Add an additional dinosaur to collection with same species for testing
    dinosaur4 = new Dinosaur('t-rex', 'carnivore', 20);
    park.addDinosaur(dinosaur4)

    actual = park.findDinosaursBySpecies('t-rex')
    assert.deepStrictEqual(actual, [dinosaur1, dinosaur4])
  });

  // This assumes that each dinosaur has unique visitors. Visitor count is based on an average amount.
  it('should be able to calculate the total number of visitors per day', function(){
    const actual = park.totalVisitorsPerDay();
    assert.strictEqual(actual, 100)
  });

  // This assumes that each dinosaur has unique visitors, and that a year has 365 days. Visitor count is based on an average amount.
  it('should be able to calculate the total number of visitors per year', function(){
    const actual = park.totalVisitorsPerYear();
    assert.strictEqual(actual, 36500)
  });

  // This assumes that each dinosaur has unique visitors, and that a year has 365 days. Visitor count is based on an average amount.
  it('should be able to calculate total revenue for one year', function(){
    const actual = park.totalRevenuePerYear();
    assert.strictEqual(actual, 1460000)
  });

  // EXTENSIONS
  describe('Extensions', function(){
    it('should be able to remove all dinosaurs of a particular species', function(){
      // Add an additional dinosaur to collection with same species for testing
      dinosaur4 = new Dinosaur('t-rex', 'carnivore', 20);
      park.addDinosaur(dinosaur4)

      const actual = park.removeAllDinosaursBySpecies('t-rex');
      assert.deepStrictEqual(actual, [dinosaur2, dinosaur3])
    });
    it('should provide an object containing each of the diet types and the number of dinosaurs in the park of that diet type', function(){
      // Add an additional dinosaur to collection with same diet for testing
      dinosaur4 = new Dinosaur('velociraptor', 'carnivore', 40);
      park.addDinosaur(dinosaur4)

      const actual = park.dinosaurDiets()
      assert.deepStrictEqual(actual, {'carnivore': 2, 'herbivore': 1, 'omnivore': 1})
    });
  })

});
