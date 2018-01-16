package cgpa_calculator_uos;

import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

int [] chr = {0,0,0,0,0,0}; 
double [] gpa = {0.0,0.0,0.0,0.0,0.0,0.0};
double [] cal_gpa = {0.0,0.0,0.0,0.0,0.0,0.0};
double sum_gpa , total=0.0;
int sum_chr=0;
String user_selection = null;
String [] cs= {"None","Basic Electronics", "Programming Fundamentals", "Introduction to ICT", "Islamic Studies",
    "Calculus and Analytical Geomertry", "Functional English",
    "Object Oriented Programming", "Digital Logical Design",
    "Discrete Structure", "Probability and Statistics", "Communication Skills", "Multivariable Calculus" ,
    "Computer Communication and Networks", "Technical and Report Writting", "Differential Equations", "Data Structures and Algorithms",
    "Computer Organization and Assembly Language", "Financial Accounting",
    "Database Systems", "Linear Algebra", "Software Engineering","Design Analysis of Algorithms",
    "Computer Architecture", "Pakistan Studies",
    "Numerical Computing", "Operating Systems", "Object Oriented Analysis and Design", "Principles of Philosophy",
    "Theory of Automata and Formal Language","Internet Architecture and Protocols",
    "Web Systems and Technologies", "Principles of Management", "Human Computer Interaction", "Artificial Intelligence",
    "Multimedia Systems and Design", "Theory of Programming Languages",
    "E-Commerce Applications Development", "Enterprise Application Development", "Software Project Management",
    "Compiler Construction", "Capstone Project 1",
    "Capstone Project 2", "Cloud Computing", "Professional Pratices", "Mobile Application Development"};
int [] csCred = {0,3,4,4,2,3,3,4,3,3,3,3,3,3,3,3,3,3,3,4,3,3,3,3,2,3,4,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3} ;
    
String [] it= {"None", "Basic Electronics", "Programming Fundamentals", "Introduction to ICT", "Islamic Studies",
    "Calculus and Analytical Geomertry", "Functional English",
    "Object Oriented Programming", "Digital Logical Design" , "Discrete Structure",
    "Probability and Statistics", "Communication Skills", "Principles of Management",
    "Computer Communication and Networks", "Tecnical an Report Writing", "Linear Algebra", "Data Structures and Algorithms",
    "Information Systems", "Financial Accounting",
    "Database Systems", "Professional Practices", "Software Engineering", "Enterperneurship",
    "Internet Architecture and Protocol", "Pakistan Studies",
    "Human Computer Interaction", "Operating Systems", "OO Analysis and Design", "DB Administration and Management",
    "Multimedia System and Design", "Technology Management",
    "Web Systems and Technologies", "Enterprise Application Development", "IT Infrastructure", "System Integration and Architecture",
    "IT Project Management", "System and Network and Administration",
    "Capstone Project Part 1", "Network Design and Management", "Data and Network Security", "Mobile Application Development",
    "E-Commerce Application Development", 
    "Capstone Project Part 2", "Cloud Computing", "Enterprise Resoure Planning Systems", "Computer Game Development"};
int [] itCred = {0,3,4,4,2,3,3,4,3,3,3,3,3,3,3,3,3,3,3,4,3,3,3,3,2,3,4,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3} ;
         
String[] math= {"None","Calculus 1", "Number Theory", "Physics 1", "English 1", "Pakistan Studies", "Introduction to Computers",
    "Calculus 2", "Probability Theory", "Physics 2", "English 2", "Islamic Studies", "Programming Languages for Mathematics",
    "Calculus 3", "Vector Analysis & Mechanics", "Physics 3","English 3", "Principles of Management",
    "Algebra 1", "Ordinary Differential Equations", "Physics 4", "English 4", "Social Psychology",
    "Complex Analysis", "Algebra 2", "Real Analysis 1", "Classical Mechanics", "Topology", "Differential Geometry",
    "Logic and Reasoning", "Numerical Analysis", "Algebra 3", "Real Analysis 2", "Partial Differential Equations",
    "Functional Analysis",
    "Statistics", "*Fluid Dynamics 1", "Integral Equations", "*Remanian Geometry", "**Measure Theory",
    "Principles of Economics", "*Fluid Dynamics 2", "*Special Relativity", "*Special Functions", "**Dissertation"};
int [] mathCred = {0,3,3,4,3,2,3,3,3,4,3,2,3,3,3,4,3,3,3,3,4,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3} ;
         
String[] bba= {"None","Functional English 1", "Introduction to Psychology", "Islamic / Pakistan Studies", "Introduction to Computers",
    "Introduction to Business", "Introduction to Book & Accounting",
    "Functional English 2", "Applied Mathematics", "Financial Accounting", "Logics", "Micro Economics",
    "Statistics", "Advanced Financial Accounting", "Business Law", "Macro Economics", "Money & Banking & Credit Management",
    "Statistical Inferences", "Cost Accounting", "Calculus", "Pakistani Economy", "company Law",
    "Principles of Marketing", "Accounting for Decision Making", "Principles of Management",
    "Business Communication & Report Writting", "Business Mathematics & Statistics", "IT in Business and Office Automation",
    "Human Resource management", "Industrial & Management Accounting", "Applied Business Research",
    "Economic Theory and Issues", "Financial Management", "Management Information System",
    "Production & Operations Management", "Enterpreneurship", "Managerial Economics",
    "Strategic Business Management", "Organizational Behavior", " Total Quality Management" };
int [] bbaCred = {0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3} ;

String[] english= {"None","Study Skills", "Introduction to Linguistics", "Advance Reading Skills 1", "Pakistan Studies", "Sociology",
    "Communication Skills", "Advance Reading Skills 2", "Sociolinguistics", "Islamic Studies", "Computer Sciences", "Psychology",
    "Introduction to Literature", "History of English Literature", "Fiction 1", "Phonetics & Phonology", "Philosophy", "Statistics",
    "Prose 1", "Greek & Classical Darama 1 ", "Classical Poetry 1", "Fiction 2", "Semantics & Pragmatics", "Morphology & Syntax",
    "Shakespeare", "Literary Criticism 1", "Fiction 3", "Classical Poetry 2", "Applied Linguistics", "Discourse Analysis",
    "Literary Criticism 2", "Drama 1", "Prose 2", "Romantic Poetry", "Stylistics 1", "Research Methodology",
    "Criticism 3(Modern Critical Theories)", "Drama 3", "American Novel & Poetry", "Prose 3", "ESP", "20th Century Poetry",
    "Post Colonial Novel", "History of Western Civilization", "American Drama", "World Literature in Translation",
    "Psycholinguistics", "Stylistics 2", "Disseration" };
int [] englishCred = {0,4,3,3,2,3,3,3,3,2,4,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,6};

String [] chemistry= {"None","chemistry(Major)", "Botany(Minor)", "Zoology(Minor)", "English", "Islamiat",
    "chemistry(Major)", "Botany(Minor)", "Zoology(Minor)", "English", "Pakistan Studies",
    "chemistry(Major)", "Botany(Minor)", "Zoology(Minor)", "English", "Computer Applications / Intro. to Management",
    "chemistry(Major)", "Botany(Minor)", "Zoology(Minor)", "English", "Introduction to Management",
    "Basic Mathematics", "Analytical chemistry", "Inogranic chemistry 1", "Organic chemistry 1", "Physical chemistry 1",
    "Basic Statistics", "Biochemistry", "Inogranic chemistry 2", "Organic chemistry 2", "Physical chemistry 2",
    "Industrial chemistry ", "Forensic Science", "Research", "Specialization (4)", "Specialization (3)",
    "Environmental Chemistry", "Research", "Specialization (4)", "Specialization (3)" };
int [] chemistryCred = {0,4,4,4,3,2,4,4,4,3,2,4,4,4,3,3,4,4,4,3,3,2,4,4,4,4,2,4,4,4,4,3,2,4,4,3,3,4,4,3,} ;

String [] physics= {"None","Mechanics 1", "Waves and Oscillations", "Applications of Differentials", "English 1", "Pakistan Studies",
    "Mechanics 2", "Electricity Magnetism 1", "Techniques of Integration", "English 2", "Islamic Studies",
    "Electricity Magnetism 2", "Fundamentals of Quantum Mechanics", "Physics Lab 1", "Calculus",
    "Ordinary Differentials Equations","English 3",
    "Basics of Electronics and Nuclear Physics", "Theory of Thermodynamics", "Physics Lab 2", "Vectors and Tensors Analysis",
    "Linear Algebra", "Theory of Error Analysis",
    "Methods of Mechanical Physics 1", "Classical Mechanics 1", "Electrodynamics 1", "Electronics", "Electronics Lab",
    "Methods of Mechanical Physics 2", "Classical Mechanics 2", "Electrodynamics 2", "Quantum Mechanics 1",
    "Solid State Physics 1", "Modern Physics Lab",
    "Statistical Mechanics", "Atomic and Molecular Physics", "Plasma Physics",
    "Quantum Mechanics 2","Solid State Physics 2", "Optional Course *",
    "Computational Physics", "Laser Physics", "Relativity and Cosmology",
    "Nuclear and Elementary Particle Physics", "Optional Course / Project **" };
int [] physicsCred = {0,3,3,3,3,2,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3} ;     

String [] psychology= {"None","English 1(Compulsory)", "Introduction to Psychology", "Pakistan Studies(Compulsory)",
    "Introduction to Mathematics(Compulsory)", "Computer Studies(Compulsory)",
    "English 2(Compulsory)", "History and Systems of Psychology", "Islamic Education(Compulsory)",
    "Introduction to Statistics(Compulsory)", "Everyday Science",
    "Communication Skills 1(Compulsory)", "Sports Psychology", "Experimental Psychology",
    "Introduction to Biology 1", "Introduction to Management",
    "Communication Skills 2(Compulsory)", "Social Psychology", "Educational Psychology",
    "Introduction to Biology 2", "Introduction to Human Rights",
    "Introduction to Research Methodology", "Cross Cultural Psychology", "Computer Application in Psychology",
    "Principles of Psychological Assessment", "Fundamental Statistics in Psychology",
    "Historical Perspectives in Abnormal Psychology",
    "Advanced Research Methodology", "Neurological Basis of Behavior", "Application of Statistics in Psychology",
    "Application of Psychological Assessment", "Personality Psychology", "Psychopathology",
    "Clinical Psychology", "Neurological Dysfunctions", "Health Psychology", "Developmental Psychology",
    "Gender Issues in Psychology", "Project(Compulsory)",
    "Counseling Psychology", "Cognitive Psychology",
    "Psychology of Advertising and Marketing Research", "Project(Compulsory)" };
int [] psychologyCred = {0,3,4,3,3,3,3,4,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3} ;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }
    
     public void getuserselection(String name){
        user_selection = name;
    }
    
    public void onStart(){
        
        department_heading.setText(user_selection);
        
        switch(user_selection){
            case "Computer Science":
                for( int i=0; cs.length> i; i++){
                    sub1.addItem(cs[i]);
                    sub2.addItem(cs[i]);
                    sub3.addItem(cs[i]);
                    sub4.addItem(cs[i]);
                    sub5.addItem(cs[i]);
                    sub6.addItem(cs[i]);
                    
                }
                break;
            case "Information Technology":
                for( int i=0; it.length> i; i++){
                    sub1.addItem(it[i]);
                    sub2.addItem(it[i]);
                    sub3.addItem(it[i]);
                    sub4.addItem(it[i]);
                    sub5.addItem(it[i]);
                    sub6.addItem(it[i]);
                    
                }
                break;
            case "English":
                      for( int i=0; english.length> i; i++){
                    sub1.addItem(english[i]);
                    sub2.addItem(english[i]);
                    sub3.addItem(english[i]);
                    sub4.addItem(english[i]);
                    sub5.addItem(english[i]);
                    sub6.addItem(english[i]);
                    
                }
                break;
            case "Mathematics":
                         for( int i=0; math.length> i; i++){
                     
                    sub1.addItem(math[i]);
                    sub2.addItem(math[i]);
                    sub3.addItem(math[i]);
                    sub4.addItem(math[i]);
                    sub5.addItem(math[i]);
                    sub6.addItem(math[i]);
                   
                }
                break;
            case "Physics":
                    for( int i=0; physics.length> i; i++){
                    sub1.addItem(physics[i]);
                    sub2.addItem(physics[i]);
                    sub3.addItem(physics[i]);
                    sub4.addItem(physics[i]);
                    sub5.addItem(physics[i]);
                    sub6.addItem(physics[i]);
                    
                }    
                break;
            case "Chemistry":
                     for( int i=0; chemistry.length> i; i++){
                    sub1.addItem(chemistry[i]);
                    sub2.addItem(chemistry[i]);
                    sub3.addItem(chemistry[i]);
                    sub4.addItem(chemistry[i]);
                    sub5.addItem(chemistry[i]);
                    sub6.addItem(chemistry[i]);
                    
                }
                break;    
            case "Business & Administration":
                  for( int i=0; bba.length> i; i++){
                    sub1.addItem(bba[i]);
                    sub2.addItem(bba[i]);
                    sub3.addItem(bba[i]);
                    sub4.addItem(bba[i]);
                    sub5.addItem(bba[i]);
                    sub6.addItem(bba[i]);
                    
                }
                break;
            case "Psychology":
                    for( int i=0; psychology.length> i; i++){
                    sub1.addItem(psychology[i]);
                    sub2.addItem(psychology[i]);
                    sub3.addItem(psychology[i]);
                    sub4.addItem(psychology[i]);
                    sub5.addItem(psychology[i]);
                    sub6.addItem(psychology[i]);
                    
                }
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        department_heading = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sub1 = new javax.swing.JComboBox<>();
        mark1 = new javax.swing.JTextField();
        mark2 = new javax.swing.JTextField();
        mark3 = new javax.swing.JTextField();
        sub2 = new javax.swing.JComboBox<>();
        sub3 = new javax.swing.JComboBox<>();
        sub4 = new javax.swing.JComboBox<>();
        mark4 = new javax.swing.JTextField();
        sub5 = new javax.swing.JComboBox<>();
        mark5 = new javax.swing.JTextField();
        mark6 = new javax.swing.JTextField();
        sub6 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        precgpa = new javax.swing.JTextField();
        calculation = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        wt = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 600, 540));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("University of Sargodha Lahore Campus");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("CGPA Calculator");

        department_heading.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        department_heading.setText("English");

        jLabel4.setText("Select Your Subjects");

        jLabel5.setText("Enter Marks");

        sub1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub1ActionPerformed(evt);
            }
        });

        mark1.setText("0");
        mark1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark1ActionPerformed(evt);
            }
        });
        mark1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mark1KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mark1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mark1KeyReleased(evt);
            }
        });

        mark2.setText("0");
        mark2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mark2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mark2KeyReleased(evt);
            }
        });

        mark3.setText("0");
        mark3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark3ActionPerformed(evt);
            }
        });
        mark3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mark3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mark3KeyReleased(evt);
            }
        });

        sub2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        sub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub2ActionPerformed(evt);
            }
        });

        sub3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        sub4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        mark4.setText("0");
        mark4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mark4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mark4KeyReleased(evt);
            }
        });

        sub5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        mark5.setText("0");
        mark5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mark5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mark5KeyReleased(evt);
            }
        });

        mark6.setText("0");
        mark6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mark6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mark6KeyReleased(evt);
            }
        });

        sub6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel6.setText("Subject 1");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel7.setText("Subject 2");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel8.setText("Subject 3");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel9.setText("Subject 4");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel10.setText("Subject 5");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel11.setText("Subject 6");

        jLabel12.setText("Enter Previous GPA/CGPA");

        precgpa.setText("0.0");
        precgpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precgpaActionPerformed(evt);
            }
        });
        precgpa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precgpaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precgpaKeyReleased(evt);
            }
        });

        calculation.setText("Calculate");
        calculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel13.setForeground(java.awt.Color.red);
        jLabel13.setText("Made By : Rana Mohammed Akaash...+92-307-4527601");

        jLabel3.setText("Enter Your Current Semester");

        wt.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(department_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sub1, 0, 235, Short.MAX_VALUE)
                                    .addComponent(sub6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sub5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sub4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sub3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sub2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(calculation, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                        .addComponent(mark3)
                                        .addComponent(mark2)
                                        .addComponent(mark4)
                                        .addComponent(mark5)
                                        .addComponent(mark6))
                                    .addComponent(mark1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(207, 207, 207))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precgpa)
                            .addComponent(wt))
                        .addGap(175, 175, 175))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(department_heading)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(mark2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mark3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mark6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(precgpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculation))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mark1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mark1ActionPerformed

    private void mark3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mark3ActionPerformed

    private void sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub1ActionPerformed

    private void sub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub2ActionPerformed

    private void calculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculationActionPerformed
        // TODO add your handling code here:
        
        int m1 , m2 ,m3 , m4 , m5 , m6=0;
        double pcgpa=0.0;
        
        m1 = Integer.parseInt(mark1.getText());
        m2 = Integer.parseInt(mark2.getText());
        m3 = Integer.parseInt(mark3.getText());
        m4 = Integer.parseInt(mark4.getText());
        m5 = Integer.parseInt(mark5.getText());
        m6 = Integer.parseInt(mark6.getText());
        pcgpa= Double.parseDouble(precgpa.getText());
  
        
        if(m1>100 || m1<0)
        {
            mark1.setText("");
        }
        if(m2>100 || m2<0)
        {
            mark1.setText("");
        }
        if(m3>100 || m3<0)
        {
            mark1.setText("");
        }
        if(m4>100 || m4<0)
        {
            mark1.setText("");
        }
        if(m5>100 || m5<0)
        {
            mark1.setText("");
        }
        if(m6>100 || m6<0)
        {
            mark1.setText("");
        }
         if(pcgpa>4 || pcgpa<0)
        {
            mark1.setText("");
        }
         
         
        switch(user_selection){
        
            case "Computer Science":
                chr[0] = csCred[sub1.getSelectedIndex()];
                chr[1] = csCred[sub2.getSelectedIndex()];
                chr[2] = csCred[sub3.getSelectedIndex()];
                chr[3] = csCred[sub4.getSelectedIndex()];
                chr[4] = csCred[sub5.getSelectedIndex()];
                chr[5] = csCred[sub6.getSelectedIndex()];
                break;
            case "Information Technology": 
                chr[0] = itCred[sub1.getSelectedIndex()];
                chr[1] = itCred[sub2.getSelectedIndex()];
                chr[2] = itCred[sub3.getSelectedIndex()];
                chr[3] = itCred[sub4.getSelectedIndex()];
                chr[4] = itCred[sub5.getSelectedIndex()];
                chr[5] = itCred[sub6.getSelectedIndex()];
                break;
            case "Mathematics": 
                chr[0] = mathCred[sub1.getSelectedIndex()];
                chr[1] = mathCred[sub2.getSelectedIndex()];
                chr[2] = mathCred[sub3.getSelectedIndex()];
                chr[3] = mathCred[sub4.getSelectedIndex()];
                chr[4] = mathCred[sub5.getSelectedIndex()];
                chr[5] = mathCred[sub6.getSelectedIndex()];
                break;
            case "Physics": 
                chr[0] = physicsCred[sub1.getSelectedIndex()];
                chr[1] = physicsCred[sub2.getSelectedIndex()];
                chr[2] = physicsCred[sub3.getSelectedIndex()];
                chr[3] = physicsCred[sub4.getSelectedIndex()];
                chr[4] = physicsCred[sub5.getSelectedIndex()];
                chr[5] = physicsCred[sub6.getSelectedIndex()];
                break;
            case "Chemistry":
                chr[0] = chemistryCred[sub1.getSelectedIndex()];
                chr[1] = chemistryCred[sub2.getSelectedIndex()];
                chr[2] = chemistryCred[sub3.getSelectedIndex()];
                chr[3] = chemistryCred[sub4.getSelectedIndex()];
                chr[4] = chemistryCred[sub5.getSelectedIndex()];
                chr[5] = chemistryCred[sub6.getSelectedIndex()];
                break;
            case "Psychology": 
                chr[0] = psychologyCred[sub1.getSelectedIndex()];
                chr[1] = psychologyCred[sub2.getSelectedIndex()];
                chr[2] = psychologyCred[sub3.getSelectedIndex()];
                chr[3] = psychologyCred[sub4.getSelectedIndex()];
                chr[4] = psychologyCred[sub5.getSelectedIndex()];
                chr[5] = psychologyCred[sub6.getSelectedIndex()];
                break;
            case "Business & Administration": 
                chr[0] = bbaCred[sub1.getSelectedIndex()];
                chr[1] = bbaCred[sub2.getSelectedIndex()];
                chr[2] = bbaCred[sub3.getSelectedIndex()];
                chr[3] = bbaCred[sub4.getSelectedIndex()];
                chr[4] = bbaCred[sub5.getSelectedIndex()];
                chr[5] = bbaCred[sub6.getSelectedIndex()];
                break;
            case "English":
                chr[0] = englishCred[sub1.getSelectedIndex()];
                chr[1] = englishCred[sub2.getSelectedIndex()];
                chr[2] = englishCred[sub3.getSelectedIndex()];
                chr[3] = englishCred[sub4.getSelectedIndex()];
                chr[4] = englishCred[sub5.getSelectedIndex()];
                chr[5] = englishCred[sub6.getSelectedIndex()];
                break;
        }
        
        if(Integer.parseInt(mark1.getText())>84)
        {
            gpa[0]=4.0;
        }
        else if(Integer.parseInt(mark1.getText())>79)
        {
            gpa[0]=3.7;
        }
        else if(Integer.parseInt(mark1.getText())>74)
        {
            gpa[0]=3.3;
        }
        else if(Integer.parseInt(mark1.getText())>69)
        {
            gpa[0]=3.0;
        }
        else if(Integer.parseInt(mark1.getText())>64)
        {
            gpa[0]=2.7;
        }
        else if(Integer.parseInt(mark1.getText())>60)
        {
            gpa[0]=2.3;
        }
        else if(Integer.parseInt(mark1.getText())>57)
        {
            gpa[0]=2.0;
        }
        else if(Integer.parseInt(mark1.getText())>54)
        {
            gpa[0]=1.7;
        }
        else if(Integer.parseInt(mark1.getText())>52)
        {
            gpa[0]=1.3;
        }
         else if(Integer.parseInt(mark1.getText())>49)
        {
            gpa[0]=1.0;
        }  
        else if(Integer.parseInt(mark1.getText())<50)
        {
            gpa[0]=0.0;
        }
        if(Integer.parseInt(mark2.getText())>84)
        {
            gpa[1]=4.0;
        }
        else if(Integer.parseInt(mark2.getText())>79)
        {
            gpa[1]=3.7;
        }
        else if(Integer.parseInt(mark2.getText())>74)
        {
            gpa[1]=3.3;
        }
        else if(Integer.parseInt(mark2.getText())>69)
        {
            gpa[1]=3.0;
        }
        else if(Integer.parseInt(mark2.getText())>64)
        {
            gpa[1]=2.7;
        }
        else if(Integer.parseInt(mark2.getText())>60)
        {
            gpa[1]=2.3;
        }
        else if(Integer.parseInt(mark2.getText())>57)
        {
            gpa[1]=2.0;
        }
        else if(Integer.parseInt(mark2.getText())>54)
        {
            gpa[1]=1.7;
        }
        else if(Integer.parseInt(mark2.getText())>52)
        {
            gpa[1]=1.3;
        }
         else if(Integer.parseInt(mark2.getText())>49)
        {
            gpa[1]=1.0;
        }  
        else if(Integer.parseInt(mark2.getText())<50)
        {
            gpa[1]=0.0;
        }
        
        if(Integer.parseInt(mark3.getText())>84)
        {
            gpa[2]=4.0;
        }
        else if(Integer.parseInt(mark3.getText())>79)
        {
            gpa[2]=3.7;
        }
        else if(Integer.parseInt(mark3.getText())>74)
        {
            gpa[2]=3.3;
        }
        else if(Integer.parseInt(mark3.getText())>69)
        {
            gpa[2]=3.0;
        }
        else if(Integer.parseInt(mark3.getText())>64)
        {
            gpa[2]=2.7;
        }
        else if(Integer.parseInt(mark3.getText())>60)
        {
            gpa[2]=2.3;
        }
        else if(Integer.parseInt(mark3.getText())>57)
        {
            gpa[2]=2.0;
        }
        else if(Integer.parseInt(mark3.getText())>54)
        {
            gpa[2]=1.7;
        }
        else if(Integer.parseInt(mark3.getText())>52)
        {
            gpa[2]=1.3;
        }
         else if(Integer.parseInt(mark3.getText())>49)
        {
            gpa[2]=1.0;
        }  
        else if(Integer.parseInt(mark3.getText())<50)
        {
            gpa[2]=0.0;
        }
        
        if(Integer.parseInt(mark4.getText())>84)
        {
            gpa[3]=4.0;
        }
        else if(Integer.parseInt(mark4.getText())>79)
        {
            gpa[3]=3.7;
        }
        else if(Integer.parseInt(mark4.getText())>74)
        {
            gpa[3]=3.3;
        }
        else if(Integer.parseInt(mark4.getText())>69)
        {
            gpa[3]=3.0;
        }
        else if(Integer.parseInt(mark4.getText())>64)
        {
            gpa[3]=2.7;
        }
        else if(Integer.parseInt(mark4.getText())>60)
        {
            gpa[3]=2.3;
        }
        else if(Integer.parseInt(mark4.getText())>57)
        {
            gpa[3]=2.0;
        }
        else if(Integer.parseInt(mark4.getText())>54)
        {
            gpa[3]=1.7;
        }
        else if(Integer.parseInt(mark4.getText())>52)
        {
            gpa[3]=1.3;
        }
         else if(Integer.parseInt(mark4.getText())>49)
        {
            gpa[3]=1.0;
        }  
        else if(Integer.parseInt(mark4.getText())<50)
        {
            gpa[3]=0.0;
        }
        
        if(Integer.parseInt(mark5.getText())>84)
        {
            gpa[4]=4.0;
        }
        else if(Integer.parseInt(mark5.getText())>79)
        {
            gpa[4]=3.7;
        }
        else if(Integer.parseInt(mark5.getText())>74)
        {
            gpa[4]=3.3;
        }
        else if(Integer.parseInt(mark5.getText())>69)
        {
            gpa[4]=3.0;
        }
        else if(Integer.parseInt(mark5.getText())>64)
        {
            gpa[4]=2.7;
        }
        else if(Integer.parseInt(mark5.getText())>60)
        {
            gpa[4]=2.3;
        }
        else if(Integer.parseInt(mark5.getText())>57)
        {
            gpa[4]=2.0;
        }
        else if(Integer.parseInt(mark5.getText())>54)
        {
            gpa[4]=1.7;
        }
        else if(Integer.parseInt(mark5.getText())>52)
        {
            gpa[4]=1.3;
        }
         else if(Integer.parseInt(mark5.getText())>49)
        {
            gpa[4]=1.0;
        }  
        else if(Integer.parseInt(mark5.getText())<50)
        {
            gpa[4]=0.0;
        }
        
        if(Integer.parseInt(mark6.getText())>84)
        {
            gpa[5]=4.0;
        }
        else if(Integer.parseInt(mark6.getText())>79)
        {
            gpa[5]=3.7;
        }
        else if(Integer.parseInt(mark6.getText())>74)
        {
            gpa[5]=3.3;
        }
        else if(Integer.parseInt(mark6.getText())>69)
        {
            gpa[5]=3.0;
        }
        else if(Integer.parseInt(mark6.getText())>64)
        {
            gpa[5]=2.7;
        }
        else if(Integer.parseInt(mark6.getText())>60)
        {
            gpa[5]=2.3;
        }
        else if(Integer.parseInt(mark6.getText())>57)
        {
            gpa[5]=2.0;
        }
        else if(Integer.parseInt(mark6.getText())>54)
        {
            gpa[5]=1.7;
        }
        else if(Integer.parseInt(mark6.getText())>52)
        {
            gpa[5]=1.3;
        }
         else if(Integer.parseInt(mark6.getText())>49)
        {
            gpa[5]=1.0;
        }  
        else if(Integer.parseInt(mark6.getText())<50)
        {
            gpa[5]=0.0;
        }
       
         cal_gpa[0]=chr[0]*gpa[0];
         cal_gpa[1]=chr[1]*gpa[1];
         cal_gpa[2]=chr[2]*gpa[2];
         cal_gpa[3]=chr[3]*gpa[3];
         cal_gpa[4]=chr[4]*gpa[4];
         cal_gpa[5]=chr[5]*gpa[5];
         
        sum_gpa=cal_gpa[0]+cal_gpa[1]+cal_gpa[2]+cal_gpa[3]+cal_gpa[4]+cal_gpa[5];
        sum_chr=chr[0]+chr[1]+chr[2]+chr[3]+chr[4]+chr[5];
        total=sum_gpa/sum_chr;
        Double pree=Double.parseDouble(precgpa.getText());
        int wait= Integer.parseInt(wt.getText())-1;
        Double cal1=pree*wait;
       
      
       
        Double cal2=cal1+total;
        
        Double total=cal2 / Integer.parseInt(wt.getText());
       
      
        
        JOptionPane.showMessageDialog(null,"GPA/CGPA = " + total,
                                        "GPA/CGPA",JOptionPane.PLAIN_MESSAGE);
    
   
        
    }//GEN-LAST:event_calculationActionPerformed

    private void mark1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark1KeyPressed
        // TODO add your handling code here:
       
                switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark1.setText("");
                            break;
                            
                
                }
    }//GEN-LAST:event_mark1KeyPressed

    private void mark1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark1KeyReleased
        // TODO add your handling code here:
       
                   switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark1.setText("");
                            break;
                
                }
        
    }//GEN-LAST:event_mark1KeyReleased

    private void mark1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark1KeyTyped

    }//GEN-LAST:event_mark1KeyTyped

    private void mark2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark2KeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark2.setText("");
                            break;
        }
    }//GEN-LAST:event_mark2KeyPressed

    private void mark2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark2KeyReleased
        // TODO add your handling code here:
        switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark2.setText("");
                            break;
        }
    }//GEN-LAST:event_mark2KeyReleased

    private void mark3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark3KeyPressed
        // TODO add your handling code here:
            switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark3.setText("");
                            break;
        }
    }//GEN-LAST:event_mark3KeyPressed

    private void mark3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark3KeyReleased
        // TODO add your handling code here:
            switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark3.setText("");
                            break;
        }
    }//GEN-LAST:event_mark3KeyReleased

    private void mark4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark4KeyPressed
        // TODO add your handling code here:
        
            switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark4.setText("");
                            break;
        }
    }//GEN-LAST:event_mark4KeyPressed

    private void mark4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark4KeyReleased
        // TODO add your handling code here:
        
            switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark4.setText("");
                            break;
        }
    }//GEN-LAST:event_mark4KeyReleased

    private void mark5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark5KeyPressed
        // TODO add your handling code here:
        
            switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark5.setText("");
                            break; 
        }
    }//GEN-LAST:event_mark5KeyPressed

    private void mark5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark5KeyReleased
        // TODO add your handling code here:
        
        switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark5.setText("");
                            break;
        }
    }//GEN-LAST:event_mark5KeyReleased

    private void mark6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark6KeyPressed
        // TODO add your handling code here:
             switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark6.setText("");
                            break;
        }
    }//GEN-LAST:event_mark6KeyPressed

    private void mark6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mark6KeyReleased
        // TODO add your handling code here:
             switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '.':
                    case '<':
                    case ',':
                        
                            mark6.setText("");
                            break;
        }
    }//GEN-LAST:event_mark6KeyReleased

    private void precgpaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precgpaKeyPressed
        // TODO add your handling code here:
        
             switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '<':
                    case ',':
                        
                            precgpa.setText("");
                            break;
        }
    }//GEN-LAST:event_precgpaKeyPressed

    private void precgpaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precgpaKeyReleased
        // TODO add your handling code here:
        
             switch(evt.getKeyChar())
                {
                    case 'A':
                    case 'a':
                    case 'B':
                    case 'b':
                    case 'C':
                    case 'c':
                    case 'D':          
                    case 'd':
                    case 'E':
                    case 'e':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'I':
                    case 'i':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':  
                    case 'L':
                    case 'l':
                    case 'M':
                    case 'm':
                    case 'N':      
                    case 'n':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                    case 'Q':
                    case 'q':
                    case 'R':
                    case 'r':
                    case 'S':
                    case 's':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'V':
                    case 'v':
                    case 'W':
                    case 'w':
                    case 'X':
                    case 'x':
                    case 'Y':
                    case 'y':
                    case 'Z':
                    case 'z':
                    case '`':
                    case '~':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '^':
                    case '%':
                    case '*':
                    case '&':
                    case '(':
                    case ')':
                    case '-':
                    case '_':
                    case '=':
                    case '+':
                    case '|': 
                    case '\\':
                    case ']':
                    case '}':
                    case '[':
                    case '{':
                    case '"':
                    case '\'':
                    case ':':
                    case ';':
                    case '?':
                    case '/':
                    case '>':
                    case '<':
                    case ',':
                        
                            precgpa.setText("");
                            break;
        }
    }//GEN-LAST:event_precgpaKeyReleased

    private void precgpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precgpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precgpaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculation;
    private javax.swing.JLabel department_heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField mark1;
    private javax.swing.JTextField mark2;
    private javax.swing.JTextField mark3;
    private javax.swing.JTextField mark4;
    private javax.swing.JTextField mark5;
    private javax.swing.JTextField mark6;
    private javax.swing.JTextField precgpa;
    private javax.swing.JComboBox<String> sub1;
    private javax.swing.JComboBox<String> sub2;
    private javax.swing.JComboBox<String> sub3;
    private javax.swing.JComboBox<String> sub4;
    private javax.swing.JComboBox<String> sub5;
    private javax.swing.JComboBox<String> sub6;
    private javax.swing.JTextField wt;
    // End of variables declaration//GEN-END:variables
}
