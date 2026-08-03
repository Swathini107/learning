function countWords() {
    let text = document.getElementById("text").value.trim();

    if (text === "") {
        document.getElementById("result").innerHTML = "No words to count.";
        return;
    }

    let words = text.split(/\s+/);
    document.getElementById("result").innerHTML = words.length + " Words";
}