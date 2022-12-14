const Park = function (name, ticketPrice, dinosaurCollection) {
    this.name = name;
    this.ticketPrice = ticketPrice;
    this.dinosaurCollection = dinosaurCollection;
  }

  Park.prototype.addDinosaur = function(dinosaur) {
    this.dinosaurCollection.push(dinosaur);
  }

  Park.prototype.removeDinosaur = function(dinosaur) {
    const index = this.dinosaurCollection.indexOf(dinosaur);
    this.dinosaurCollection.splice(index, 1);
  }

  Park.prototype.dinoWithMostVisitors = function() {
    // Create an initial variable initially set to first dinosaur in collection, which gets replaced throughout the for loop.
    let mostVisitedDino = this.dinosaurCollection[0];
    for(dinosaur of this.dinosaurCollection){
      if (dinosaur.guestsAttractedPerDay > mostVisitedDino){
        mostVisitedDino = dinosaur;
      }
    }
    return mostVisitedDino;
  }
  
  Park.prototype.findDinosaursBySpecies = function(species) {
    dinosaursBySpecies = [];
    for(dinosaur of this.dinosaurCollection){
      if(dinosaur.species === species){
        dinosaursBySpecies.push(dinosaur);
      }
    }
    return dinosaursBySpecies;
  }

  Park.prototype.totalVisitorsPerDay = function() {
    let total = 0;
    for(dinosaur of this.dinosaurCollection){
      total += dinosaur.guestsAttractedPerDay;
    }
    return total;
  }

  Park.prototype.totalVisitorsPerYear = function() {
    let total = this.totalVisitorsPerDay();
    total *= 365;
    return total;
  }

  Park.prototype.totalRevenuePerYear = function() {
    let total = this.totalVisitorsPerYear();
    total *= this.ticketPrice;
    return total;
  }


  // EXTENSIONS


  // If the dinosaur is not part of the species requested, it is added to a list. Later in the function the list of remaining dinosaurs overwrites the original collection.
  Park.prototype.removeAllDinosaursBySpecies = function(particularSpecies) {
    let dinosaursRemaining = [];
    for(dinosaur of this.dinosaurCollection){
      if(dinosaur.species !== particularSpecies){
        dinosaursRemaining.push(dinosaur);
      }
    }
    this.dinosaurCollection = dinosaursRemaining;
    return this.dinosaurCollection
  }

  // Needed for dinosaurDiets prototype below
  Park.prototype.findDinosaursByDiet = function(diet) {
    let dinosaursByDiet = [];
    for(dinosaur of this.dinosaurCollection){
      if(dinosaur.diet === diet){
        dinosaursByDiet.push(dinosaur);
      }
    }
    return dinosaursByDiet;
  }

  Park.prototype.dinosaurDiets = function(){
    let dietObject = {}
    for(dinosaur of this.dinosaurCollection){
      dietObject[dinosaur.diet] = this.findDinosaursByDiet(dinosaur.diet).length;
    }
    return dietObject;
  }

  module.exports = Park;