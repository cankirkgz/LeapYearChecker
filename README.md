<h1>Leap Year Checker</h1>

   <p>This is a simple Java program that checks whether a given year is a leap year or not.</p>

   <h2>Prerequisites</h2>

   <p>To run this program, make sure you have Java Development Kit (JDK) installed on your system.</p>

   <h2>How to Use</h2>

   <ol>
        <li>Clone the repository or download the source code files.</li>
        <li>Compile the Java source file using the following command:</li>
        <pre><code>javac Main.java</code></pre>
        <li>Run the compiled program using the following command:</li>
        <pre><code>java Main</code></pre>
        <li>Enter a year when prompted.</li>
        <li>The program will determine whether the entered year is a leap year or not and display the result.</li>
    </ol>

   <h2>How It Works</h2>

   <p>The program prompts the user to enter a year. It then performs the following checks to determine if the year is a leap year:</p>

   <ol>
        <li>Check if the year is divisible by 4.</li>
        <li>If it is divisible by 4, check if it is divisible by 100.</li>
        <li>If it is divisible by 100, check if it is divisible by 400.</li>
        <li>If it is divisible by 400, it is a leap year.</li>
        <li>If it is not divisible by 400, it is not a leap year.</li>
    </ol>

   <p>The program prints the appropriate message based on the leap year determination.</p>

   <h2>Example</h2>

   <pre><code>Bir yıl girin: 2024
2024 bir artık yıldır!
   </code></pre>

   <pre><code>Bir yıl girin: 2022
2022 bir artık yıl değildir!
    </code></pre>

   <h2>License</h2>

   <p>This project is licensed under the <a href="LICENSE">MIT License</a>.</p>
