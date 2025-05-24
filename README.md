<h1>Java_CRUD_Example – Apache NetBeans Version</h1>
<p>
  <strong>About</strong><br />
  Java desktop application using <code>Swing</code> to manage client data with full CRUD functionality, 
  interface-based DAO pattern, and in-memory storage. This project was made using Apache NetBeans and complements 
  my first Java CRUD app, which uses <code>JOptionPane</code> dialogs and was built in Spring Tools Suite 4 (STS4).
</p>
<h2>🖼️ Screenshot</h2>
  <p>A quick look at the application, showcasing the user interface with one added client.</p>
  
![Swing CRUD Application Screenshot](https://servidor-host-imagens.vercel.app/Java_CRUD_Example_Apache.jpg)

<h2>📌 Features</h2>
<ul>
  <li>Client Registration, Search, Update, and Deletion through a Swing GUI;</li>
  <li>DAO pattern with in-memory data management (<code>HashMap</code> and <code>HashSet</code> implementations);</li>
  <li>Client data displayed dynamically in a JTable with seven columns;</li>
  <li>CPF field is disabled during client modification to preserve uniqueness;</li>
  <li>Validation for empty fields and confirmation dialogs for user actions;</li>
  <li>Improved form layout and naming conventions for clarity and maintainability.</li>
</ul>
<h2>🗂️ Packages Structure</h2>
<ul>
  <li><code>src.dao</code>: DAO interface and its in-memory implementations;</li>
  <li><code>src.domain</code>: Client domain model;</li>
  <li><code>src.java_crud_example_apache</code>: GUI classes with Swing components and event handlers.</li>
</ul>
<h2>🧩 Class Overview</h2>
<ul>
  <li><strong>Client</strong>: Represents the client entity with personal and contact information;</li>
  <li><strong>IClientDAO</strong>: Defines the contract for CRUD operations;</li>
  <li><strong>ClientMapDAO</strong> and <strong>ClientSetDAO</strong>: Implementations using 
    <code>HashMap</code> and <code>HashSet</code> for client data storage;</li>
  <li><strong>GUI Classes</strong>: Handle user interactions, form input, and table updates using Swing components.</li>
</ul>
<h2>🚀 How to Run</h2>
<ol>
  <li>Make sure you have Java 15 or newer installed;</li>
  <li>Clone the repository and open the project in Apache NetBeans;</li>
  <li>Run the <code>Dashboard.java</code> main GUI class;</li>
  <li>Use the graphical interface to manage client data with full CRUD operations.</li>
</ol>
<h2>📅 Commit Highlights</h2>

<h3>May 23, 2025</h3>
<ul>
  <li>Added warning dialog if no client is selected for editing;</li>
  <li>Disabled CPF field when modifying a client to preserve identity;</li>
  <li>Re-enabled CPF field when clearing the form for new entries;</li>
  <li>Fixed JTable to update all fields immediately after modification;</li>
  <li>Added modify functionality and support for all seven fields;</li>
  <li>Updated emptyFields() to reset all form inputs correctly;</li>
  <li>Adjusted table layout to include Phone, Address Number, City, and State columns;</li>
  <li>Improved component naming for better readability and maintainability;</li>
  <li>Created client dashboard GUI using Swing with full CRUD operations;</li>
  <li>Implemented confirmation dialogs and real-time table population for user feedback.</li>
</ul>
<h3>May 22, 2025</h3>
<ul>
  <li>Added DAO interface and its in-memory implementations using <code>HashMap</code> and <code>HashSet</code>;</li>
  <li>Created domain class <code>Client</code> with CPF and other attributes;</li>
  <li>Organized source files under <code>src/dao</code> and <code>src/domain</code> packages;</li>
  <li>Initial NetBeans project setup and added <code>.gitignore</code> file.</li>
</ul>
<h2>📌 Requirements</h2>
<ul>
  <li>Java 15+ (recommended);</li>
  <li>Apache NetBeans IDE (or any IDE that supports Swing and Java desktop projects);</li>
  <li>No external libraries required (pure Java Swing).</li>
</ul>
<h2>📚 Learning Goals</h2>
<ul>
  <li>Learn desktop GUI development with Swing components;</li>
  <li>Understand event-driven programming and form validation;</li>
  <li>Implement DAO pattern for data abstraction and storage;</li>
  <li>Practice Java OOP concepts in a desktop environment.</li>
</ul>
<h3>🔗 Related Projects</h3>
<p>
  This project complements my first Java CRUD application, which uses <code>JOptionPane</code> dialogs for the UI and was developed using Spring Tools Suite 4 (STS4). Both projects implement similar client data management functionality but showcase different Java UI approaches and IDEs.
</p>
<p>
  Check out the related repository here:<br />
  <a href="https://github.com/AsrielDreemurrGM/Java_CRUD_Example" target="_blank" rel="noopener noreferrer">Java_CRUD_Example (JOptionPane, STS4)</a>
</p>
