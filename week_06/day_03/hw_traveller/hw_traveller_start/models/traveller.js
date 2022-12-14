const Traveller = function(journeys) {
  this.journeys = journeys;
};

Traveller.prototype.getJourneyStartLocations = function() {
  const startLocations = this.journeys.map((journey) => {
    return journey.startLocation;
  });
  return startLocations;
};

Traveller.prototype.getJourneyEndLocations = function () {
  const endLocations = this.journeys.map((journey) => {
    return journey.endLocation;
  });
  return endLocations;
};

Traveller.prototype.getJourneysByTransport = function (transport) {
  const journeysByTransport = this.journeys.filter((journey) => {
    return journey.transport === transport;
  })
  return journeysByTransport;
};

Traveller.prototype.getJourneysByMinDistance = function (minDistance) {
  const journeysOverMinDistance = this.journeys.filter((journey) => {
    return journey.distance > minDistance;
  })
  return journeysOverMinDistance;
};

// EXTENSIONS

Traveller.prototype.calculateTotalDistanceTravelled = function () {
  const totalDistanceTravelled = this.journeys.reduce((total, journey) => {
    return total + journey.distance;
  }, 0);
  return totalDistanceTravelled;
};

Traveller.prototype.getUniqueModesOfTransport = function () {
  const uniqueTransports = this.journeys
    .map((journey) => journey.transport)
    .filter((value, index, self) => self.indexOf(value) === index);
  return uniqueTransports;
};


module.exports = Traveller;