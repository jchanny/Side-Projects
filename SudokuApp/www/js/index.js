var app = {
    // Application Constructor
    initialize: function() {
        document.addEventListener('deviceready', this.onDeviceReady.bind(this), false);

    },

    onDeviceReady: function() {
        this.receivedEvent('deviceready');
    },

    receivedEvent: function(id) {
        var parentElement = document.getElementById(id);
        var listeningElement = parentElement.querySelector('.listening');
        var receivedElement = parentElement.querySelector('.received');

        listeningElement.setAttribute('style', 'display:none;');
        receivedElement.setAttribute('style', 'display:block;');

        console.log('Received Event: ' + id);
    }
};

//array of cubes
var game = [];
//where the numbers go
//0-8
//9-17
//18-26
//27-35
//36-44
//45-53
//54-62
//63-71
//72-80

//cube stores the remaining numbers for each cube
//012
//345
//678
var cube = [];

//initialize main app
function createGame(){
    
}

//returns true if number can be placed there
function checkNumber(indexToBePlaced, number){
    if(findHorizRange(indexToBePlaced,number)===false && findVertRange(indexToBePlaced,number)===false){
        return true;
    }
    return false;
}

//finds the range of indices for checkHoriz
//if returns true, that means number was found horizontally
function findHorizRange(index, number){
    switch(index){
    case (index<=8 && index>=0):
        return checkHorizontally(0, 8, number);
        break;
    case (index > 8 && index<=17):
        return checkHorizontally(9,17, number);
        break;
    case (index>17 && index<=26):
        return checkHorizontally(18,26, number);
        break;
    case(index>26 && index<=35):
        return checkHorizontally(27,35, number);
        break;
    case(index>35 && index<=44):
        return checkHorizontally(36,44, number);
        break;
    case(index>44 && index<=53):
        return checkHorizontally(45,53, number);
        break;
    case(index>53 && index<=62):
        return checkHorizontally(54,62, number);
        break;
    case(index>62 && index<=71):
        return checkHorizontally(63,71, number);
        break;
    default:
        return checkHorizontally(72,80, number);
        break;
    }
}

//returns true if there is another number horizontally
function findVertRange(index,number){
    var upIncr = index;

    while(index < game.length){
        if(game[upIncr]===number){
            return true;
        }
        upIncr+=9;
    }

    var downIncr = index;
    while(index >= 0 ){
        if(game[downIncr]===number){
            return true;
        }
        downIncr-=9;
    }

    return false;
}

//param: start index of where to look; end: end index of where to look
//returns true if there is another number horizontally
function checkHorizontally(start,end, number){
    for(int i = start; i <= end; i++){
        if(game[i] === number){
            return true;
        }
    }
    return false;
}
