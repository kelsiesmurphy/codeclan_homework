# Scope Homework: Who Dunnit

### Learning Objectives

- Understand function scope
- Know the difference in between the let and const keywords

## Brief

Using your knowledge about scope and variable declarations in JavaScript, look at the following code snippets and predict what the output or error will be and why. Copy the following episodes into a JavaScript file and add comments under each one detailing the reason for your predicted output.

### MVP

#### Episode 1

```js
const scenario = {
  murderer: 'Miss Scarlet',
  room: 'Library',
  weapon: 'Rope'
};

const declareMurderer = function() {
  return `The murderer is ${scenario.murderer}.`;
}

const verdict = declareMurderer();
console.log(verdict);
// The verdict will declare the murderer to be 'Miss Scarlet'
```

#### Episode 2

```js
const murderer = 'Professor Plum';

const changeMurderer = function() {
  murderer = 'Mrs. Peacock';
}

const declareMurderer = function() {
  return `The murderer is ${murderer}.`;
}

changeMurderer();
const verdict = declareMurderer();
console.log(verdict);
// The verdict should declare the murderer to be 'Mrs. Peacock', but the murderer variable was initialised with the 'const' keyword, and therefore cannot be updated, so it will throw an error. Changing line 35 to use the 'let' keyword will fix this issue.
```

#### Episode 3

```js
let murderer = 'Professor Plum';

const declareMurderer = function() {
  let murderer = 'Mrs. Peacock';
  return `The murderer is ${murderer}.`;
}

const firstVerdict = declareMurderer();
console.log('First Verdict: ', firstVerdict);
// The first verdict should log 'Mrs. Peacock' as the murderer.

const secondVerdict = `The murderer is ${murderer}.`;
console.log('Second Verdict: ', secondVerdict);
// The second verdict should log 'Professor Plum' as the murderer, as it does not use the declareMurderer function.
```

#### Episode 4

```js
let suspectOne = 'Miss Scarlet';
let suspectTwo = 'Professor Plum';
let suspectThree = 'Mrs. Peacock';

const declareAllSuspects = function() {
  let suspectThree = 'Colonel Mustard';
  return `The suspects are ${suspectOne}, ${suspectTwo}, ${suspectThree}.`;
}

const suspects = declareAllSuspects();
console.log(suspects);
// Expected output: 'The suspects are Miss Scarlet, Professor Plum, Colonel Mustard.'
console.log(`Suspect three is ${suspectThree}.`);
// Expected output: 'Suspect three is Mrs. Peacock', as the declareAllSuspects method has not been used.
```

#### Episode 5

```js
const scenario = {
  murderer: 'Miss Scarlet',
  room: 'Kitchen',
  weapon: 'Candle Stick'
};

const changeWeapon = function(newWeapon) {
  scenario.weapon = newWeapon;
}

const declareWeapon = function() {
  return `The weapon is the ${scenario.weapon}.`;
}

changeWeapon('Revolver');
const verdict = declareWeapon();
console.log(verdict);
// Expected output: The weapon is the Candle Stick
// I was wrong, the weapon was the revolver, and this is because that whilst the object itself is immutable, its attributes can be updated.
```

#### Episode 6

```js
let murderer = 'Colonel Mustard';

const changeMurderer = function() {
  murderer = 'Mr. Green';

  const plotTwist = function() {
    murderer = 'Mrs. White';
  }

  plotTwist();
}

const declareMurderer = function () {
  return `The murderer is ${murderer}.`;
}

changeMurderer();
const verdict = declareMurderer();
console.log(verdict);
// Expected Output: The murderer is Mrs. White
```

#### Episode 7

```js
let murderer = 'Professor Plum';

const changeMurderer = function() {
  murderer = 'Mr. Green';

  const plotTwist = function() {
    let murderer = 'Colonel Mustard';

    const unexpectedOutcome = function() {
      murderer = 'Miss Scarlet';
    }

    unexpectedOutcome();
  }

  plotTwist();
}

const declareMurderer = function() {
  return `The murderer is ${murderer}.`;
}

changeMurderer();
const verdict = declareMurderer();
console.log(verdict);
// Expected Output: The murderer is Miss Scarlet
// This is wrong, as the 'let' assignment on line 147 will essentially mask the original let assignment on line 141, and will be forgotten when it comes back out of the function.
```

#### Episode 8

```js
const scenario = {
  murderer: 'Mrs. Peacock',
  room: 'Conservatory',
  weapon: 'Lead Pipe'
};

const changeScenario = function() {
  scenario.murderer = 'Mrs. Peacock';
  scenario.room = 'Dining Room';
  // Mrs Peacock, Dining Room, Lead pipe

  const plotTwist = function(room) {
    if (scenario.room === room) {
      scenario.murderer = 'Colonel Mustard';
      // Colonel Mustard, Dining Room, Lead Pipe
    }

    const unexpectedOutcome = function(murderer) {
      if (scenario.murderer === murderer) {
        scenario.weapon = 'Candle Stick';
      }
    }

    unexpectedOutcome('Colonel Mustard');
  }

  plotTwist('Dining Room');
}

const declareWeapon = function() {
  return `The weapon is ${scenario.weapon}.`
}

changeScenario();
const verdict = declareWeapon();
console.log(verdict);
// Expected Output: The weapon is Candle Stick
```

#### Episode 9

```js
let murderer = 'Professor Plum';

if (murderer === 'Professor Plum') {
  let murderer = 'Mrs. Peacock';
}

const declareMurderer = function() {
  return `The murderer is ${murderer}.`;
}

const verdict = declareMurderer();
console.log(verdict);
// Expected Output: The murderer is Professor Plum. Similar reason to the issue in episode 7, the let on 218 is reassigning murderer, and will be forgotten outside the if statement.
```

### Extensions

Make up your own episode!
```js
const scenario = {
  murderer: 'Miss Scarlet',
  room: 'Basement',
  weapon: 'Revolver'
}

const changeRoom = (newRoom) => {
  scenario.room = newRoom;
}

changeRoom('Garden')
const declareMurderer = function() {
  return `The murderer is ${murderer}, in the ${room} with the ${weapon}!`;
}
const verdict = declareMurderer();
console.log(verdict);

```