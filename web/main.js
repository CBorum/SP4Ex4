$("#button").click(function () {
    $("#quote").get("quote");
});
$("#button2").click(function () {
    $.post("persons", {todo: "write post values"}).done(function (data) {
        var a = $.parseJSON(data);
        $.each(a, function (index) {
            $("#persons").append("<p>" + a[index].firstName + "<p>");
            $("#persons").append("<p>" + a[index].lastName + "<p>");
            $("#persons").append("<p>" + a[index].age + "<p>");
        });
    });
});
$("g").click(function () {
    console.log("you pressed " + this.id)
});
window.setInterval(function () {
    $("#time").load("time");
}, 1000);

