
<body>

<h1>🎯 Battleship Game (Java Console)</h1>

<p>
A simple <strong>console-based Battleship game</strong> written in Java.
The player must locate and destroy all hidden ships on a 5×5 grid within limited attempts.
</p>


<h2>🧠 Game Overview</h2>
<ul>
    <li>5×5 ocean grid</li>
    <li>3 ships randomly placed</li>
    <li>Player gets 7 chances</li>
    <li>Game ends when all ships are destroyed or turns run out</li>
</ul>

<h2>🎮 Game Symbols</h2>

<table>
    <tr>
        <th>Symbol</th>
        <th>Meaning</th>
    </tr>
    <tr>
        <td>O</td>
        <td>Unvisited Cell</td>
    </tr>
    <tr>
        <td>X</td>
        <td>Hit (Ship Destroyed)</td>
    </tr>
    <tr>
        <td>-</td>
        <td>Miss</td>
    </tr>
</table>

<h2>🧩 How the Game Works</h2>
<ol>
    <li>Board is initialized with <code>O</code></li>
    <li>3 unique ship locations are generated randomly</li>
    <li>User enters row and column values (0–4)</li>
    <li>Program checks:
        <ul>
            <li>If input is valid</li>
            <li>If location was already attacked</li>
            <li>If a ship is hit or missed</li>
        </ul>
    </li>
    <li>Game ends when:
        <ul>
            <li>All ships are destroyed OR</li>
            <li>All turns are used</li>
        </ul>
    </li>
</ol>

<h2>🛠 Technologies Used</h2>
<ul>
    <li>Java</li>
    <li>ArrayList</li>
    <li>Scanner</li>
    <li>Math.random()</li>
</ul>

<h2>📂 Project Structure</h2>
<pre>
Game.java
</pre>

<h2>▶️ How to Run</h2>
<pre>
javac Game.java
java Game
</pre>

<h2>🧪 Sample Output</h2>
<pre>
Starting the Attack !!

O O O O O
O O O O O
O O O O O
O O O O O
O O O O O

Enter the Row you want to Attack (0-4):
2
Enter the Col you want to Attack (0-4):
3
Wooohoooo!! You sank opponent's ship
Ships Remaining: 4
</pre>

<h2>✅ Features</h2>
<ul>
    <li>Random ship placement</li>
    <li>Duplicate attack prevention</li>
    <li>Clear win / lose conditions</li>
    <li>Dynamic board updates</li>
</ul>

<h2>🚀 Future Improvements</h2>
<ul>
    <li>Difficulty levels</li>
    <li>Ship sizes greater than 1</li>
    <li>Multiplayer mode</li>
    <li>Replay option</li>
    <li>GUI version</li>
</ul>

<hr>

<p><strong>Author:</strong> Ketan Goyal</p>
<p><strong>Language:</strong> Java</p>

</body>
</html>
