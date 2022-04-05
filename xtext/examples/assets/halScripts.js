(function draw() {
    var canvas = document.getElementById("roomName")
    var ctx = canvas.getContext('2d');
    sensor = new Image();
    sensor.src = '../images/sensor.jpg';
    sensor.onload = function() {
        canvas.drawImage(sensor, 0, 0)
    }
}