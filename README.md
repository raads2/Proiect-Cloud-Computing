





Proiect Cloud Computing

Dezvoltarea unei aplicații mobile pentru promovarea turismului în București















Student: Tîrhoacă Radu
Grupa 1152, SIMPRE
Git: https://github.com/raads2/Proiect-Cloud-Computing.git
Youtube: https://youtu.be/t8jCNThV0Q4



 
Table of Contents
Introducere	3
Descriere problemă	3
1.	Scopul Aplicației	4
2.	Analiza Cerințelor	4
2.1 Cerințe funcționale	4
2.2 Cerințe nefuncționale	5
3.	Arhitectura Aplicației	5
Descriere API	6
Flux de Date	7
Capturi Ecran Aplicație	9
Concluzii	13
Referințe	13

 
Introducere
În contextul globalizării și al avansului tehnologic accelerat, turismul urban devine tot mai dependent de soluții digitale inovatoare. Municipiul București este un oraș cu un bogat patrimoniu istoric, arhitectural și cultural, însă potențialul său turistic este adesea subexploatat din cauza unei promovări insuficiente și a lipsei unor instrumente moderne, adaptate nevoilor vizitatorilor de azi.
Tehnologia joacă un rol tot mai important în modul în care descoperim și interacționăm cu locurile din jurul nostru. Am observat că orașul are multe de oferit din punct de vedere turistic, dar nu întotdeauna aceste resurse sunt puse în valoare în mod eficient. Această observație a reprezentat punctul de plecare pentru alegerea temei prezentei lucrări.
Aplicațiile mobile reprezintă astăzi un canal esențial prin care turiștii își planifică și își personalizează experiențele de călătorie. Astfel, dezvoltarea unei aplicații mobile dedicate promovării obiectivelor turistice din București poate avea un impact semnificativ în creșterea vizibilității orașului și în facilitarea accesului la informații relevante și actualizate.
Scopul principal al acestei disertații este de a proiecta și implementa o aplicație prietenoasă, interactivă și eficientă, care să răspundă cerințelor utilizatorilor moderni și să sprijine eforturile de digitalizare a promovării turistice. Lucrarea combină interese în programare, design UX/UI și turism, propunând o soluție practică, aplicabilă și scalabilă în peisajul urban românesc.
Descriere problemă
Turismul inteligent („smart tourism”) este un concept relativ nou, folosit pentru a descrie dependența tot mai mare a destinațiilor turistice, a industriilor din domeniu și a turiștilor față de noile forme de tehnologii ale informației și comunicațiilor (TIC), care permit transformarea unor cantități masive de date în propuneri de valoare. Cu toate acestea, conceptul rămâne insuficient definit, ceea ce îngreunează dezvoltarea sa teoretică.
Gretzel, Sigala, Xiang & Koo (2015) își propun să ofere o definire clară a turismului inteligent, să evidențieze tendințele actuale din domeniu și să explice fundamentele tehnologice și de afaceri care îl susțin. În continuare, lucrarea oferă o scurtă analiză a perspectivelor și a limitărilor acestui tip de turism. De asemenea, este subliniată nevoia acută de cercetare academică riguroasă, care să ghideze dezvoltarea și gestionarea eficientă a turismului inteligent.
Conceptul de „smart” a fost popularizat în ultimele decenii pentru a descrie transformările generate de noile tehnologii în diverse domenii ale societății. Höjer și Wangel (2015) subliniază că inteligența tehnologică nu constă doar în avansul individual al unor tehnologii specifice, ci mai ales în interconectarea, sincronizarea și utilizarea lor coordonată. În același sens, Harrison et al. (2010) definesc conceptul de „smart” ca fiind capacitatea de a exploata date operaționale în timp real, de a integra și partaja aceste date și de a le analiza complex pentru a fundamenta decizii eficiente și rapide.
Aplicațiile acestui concept sunt multiple: de la „smart cities”, care urmăresc optimizarea resurselor și îmbunătățirea calității vieții urbane prin guvernanță eficientă și sustenabilă, până la infrastructuri inteligente precum locuințele sau fabricile conectate digital. În plan economic, se vorbește despre „smart economy” ca despre un model de colaborare și inovare alimentat de tehnologii avansate și conectivitate extinsă.
În contextul turismului, noțiunea de „smart tourism” integrează toate aceste dimensiuni, reprezentând un domeniu emergent caracterizat prin digitalizare, interactivitate și personalizarea experiențelor turistice. Literatură recentă evidențiază faptul că există o susținere instituțională puternică pentru dezvoltarea acestui tip de turism, în special în Asia, unde guvernele din China și Coreea de Sud investesc semnificativ în infrastructuri digitale dedicate (Hwang et al., 2015). În Europa, turismul inteligent este adesea o extensie a proiectelor de tip „smart city”, punând accent pe competitivitate, inovație și dezvoltarea de aplicații care utilizează date preexistente într-un mod inovator (Lamsfus et al., 2015; Boes et al., 2015a, b). În Australia, cercetările se concentrează pe guvernanță inteligentă și utilizarea datelor deschise.
Consensul este că tehnologiile inteligente au un potențial transformator nu doar în plan economic, ci și la nivelul experienței turistice individuale, facilitând interacțiunea, personalizarea și sustenabilitatea serviciilor oferite.

1.	Scopul Aplicației
Aplicația mobilă propusă în această lucrare are ca scop principal promovarea turismului urban în București prin intermediul tehnologiei mobile. Proiectul urmărește să faciliteze accesul utilizatorilor – atât turiști români, cât și străini – la informații esențiale despre obiectivele turistice ale orașului, într-un mod interactiv, modern și accesibil.
În contextul dezvoltării conceptului de smart tourism, aplicația își propune să răspundă nevoii tot mai mari de digitalizare a experienței turistice, combinând elemente de informare, personalizare și interacțiune. Prin funcționalități precum posibilitatea rezervării de tururi în oraș, marcarea locurilor favorite, explorarea vizuală a obiectivelor și posibilitatea de a interacționa cu un asistent virtual bazat pe inteligență artificială, utilizatorii sunt sprijiniți în luarea deciziilor și în planificarea vizitelor într-un mod eficient și plăcut.
Scopul aplicației nu este doar de a oferi o hartă a atracțiilor turistice, ci de a crea o experiență digitală care să îmbine utilul cu plăcutul, încurajând descoperirea culturală și promovând imaginea Bucureștiului ca destinație turistică modernă. De asemenea, aplicația poate contribui indirect la dezvoltarea turismului local și la consolidarea unei relații mai dinamice între vizitatori și oraș. 
2.	Analiza Cerințelor
Pentru a putea dezvolta o aplicație mobilă eficientă și relevantă pentru promovarea turismului în București, este esențială identificarea cerințelor funcționale și nefuncționale ale sistemului. Aceste cerințe au fost stabilite având în vedere atât nevoile utilizatorilor finali (turiști), cât și obiectivele generale ale proiectului.
2.1 Cerințe funcționale
•	Afișarea obiectivelor turistice: aplicația trebuie să permită afișarea unei liste de atracții turistice din București, fiecare însoțită de o imagine, descriere și informații relevante.
•	Marcarea locurilor favorite: utilizatorii trebuie să poată salva obiectivele preferate într-o listă personală de „favorit”.
•	Integrarea unui chatbot: aplicația trebuie să ofere o interfață de tip chat în care utilizatorul poate adresa întrebări legate de atracțiile turistice, iar răspunsurile să fie generate de un model de inteligență artificială (OpenAI).
•	Interfață vizuală intuitivă: aplicația trebuie să fie ușor de utilizat și accesibilă, cu o structură logică și un design atractiv.
2.2 Cerințe nefuncționale
•	Compatibilitate: aplicația trebuie să fie compatibilă cu majoritatea dispozitivelor Android moderne.
•	Performanță: aplicația trebuie să răspundă rapid la acțiunile utilizatorului, fără întârzieri semnificative.
•	Scalabilitate: aplicația trebuie să permită adăugarea ulterioară de noi obiective turistice sau funcționalități fără a necesita modificări majore.
•	Securitate: datele utilizatorului (de exemplu, lista de favorite) trebuie gestionate într-un mod sigur, fără acces neautorizat.
•	Accesibilitate offline: aplicația ar trebui să funcționeze parțial și fără conexiune la internet, cel puțin pentru afișarea obiectivelor deja stocate local.
3.	Arhitectura Aplicației
Aplicația este dezvoltată pentru platforma Android folosind Java, și este structurată modular, pentru a permite o separare clară între componentele de interfață, logică și gestionare a datelor. Interfața grafică este realizată folosind Android XML Layouts, iar logica aplicației este implementată în clase Java corespunzătoare fiecărei activități sau componente.
Datele persistente și funcționalitățile de rețea sunt gestionate prin Firebase, după cum urmează:
a. Firebase Authentication
Pentru autentificarea utilizatorilor, aplicația folosește serviciul Firebase Authentication. Acesta permite crearea de conturi, logarea utilizatorilor existenți și menținerea unei sesiuni active. Astfel, fiecare utilizator are un profil personalizat și acces securizat la propriile date.
b. Firebase Firestore 
Gestionarea listei de sarcini (task-uri) se realizează prin Firebase Firestore (sau Realtime Database, în funcție de implementare). Acest serviciu permite:
•	Stocarea în cloud a datelor introduse de utilizator;
•	Actualizarea în timp real a listei de task-uri în aplicație, fără a fi necesară reîncărcarea manuală a interfeței;
•	Sincronizarea între mai multe dispozitive autentificate cu același cont.
Integrarea cu API-ul OpenAI oferă aplicației o componentă conversațională, care permite utilizatorului să interacționeze cu un asistent virtual direct din interfața aplicației. Acest modul folosește modelul „gpt-3.5-turbo” pentru a procesa și răspunde la întrebările sau solicitările utilizatorului. Răspunsurile sunt obținute în urma trimiterii unui mesaj printr-un request HTTP POST către endpoint-ul oficial OpenAI, folosind biblioteca OkHttpClient. Cererea include istoricul conversației într-un format JSON, iar răspunsul este analizat și afișat dinamic în aplicație. Pentru a evita trimiterea de cereri simultane care ar putea afecta performanța sau limita API-ului, aplicația folosește un flag de tip boolean care blochează inițierea unui nou request până la finalizarea celui precedent. Acest mecanism asigură o interacțiune controlată și previne suprasolicitarea serverului sau blocarea interfeței aplicației.
Așadar, aplicația oferă o experiență modernă și dinamică, specifică aplicațiilor mobile actuale, punând accent pe conectivitate, interactivitate și performanță în timp real.
Descriere API
API Autentificare
POST /register
Descriere: Creează un cont nou folosind Firebase Authentication.
Input: email, parolă
Output: Status de înregistrare (succes/eșec)
Tehnologie: Firebase Authentication

POST /login
Descriere: Autentifică un utilizator existent.
Input: email, parolă
Output: Token Firebase (autentificare) sau eroare
Tehnologie: Firebase Authentication

To-Do List API (Realtime Cloud Database)
GET /tasks
Descriere: Returnează lista de sarcini sortate descrescător după timp.
Output: Listă cu obiecte task {id, task, time, status}
Tehnologie: Firebase Firestore + Live Snapshot Listener

POST /tasks
Descriere: Adaugă o sarcină nouă.
Input: task, time, status
Output: Confirmare adăugare
Tehnologie: Firebase Firestore

DELETE /tasks/{id}
Descriere: Șterge o sarcină.
Input: id
Tehnologie: Firestore document deletion

ChatGPT API
POST /chat
Descriere: Trimite un mesaj către ChatGPT și returnează un răspuns generat.
Input: prompt (textul utilizatorului)
Output: răspunsul AI
Tehnologie: OpenAI API (gpt-3.5-turbo) cu OkHttpClient

Flux de Date
•	Autentificare utilizator:
Utilizatorul trimite datele (email, parolă) către Firebase Authentication. Firebase validează și returnează un token de autentificare.
•	Acces la resurse:
Tokenul este folosit implicit în SDK-ul Firebase pentru acces la Firestore (task-uri) și autentificare.
•	Operații CRUD:
Cererile pentru task-uri și favorite sunt sincronizate între client și server/local.
•	Chat OpenAI:
Clientul trimite un prompt către OpenAI API, primește răspunsul și îl afișează.
Exemple de Request/Response

Autentificare Firebase
•	POST /register
{
  "email": "user@example.com",
  "password": "parola123"
}
{
  "uid": "abc123xyz",
  "email": "user@example.com"
}
Similar și pentru POST/login
•	POST /tasks

{ "task": "Plimbare", "time": "15:00", "status": 0 }
{ "success": true, "message": "Task adăugat." }

•	POST /chat
{ "prompt": "Sugerează 3 locuri de vizitat în București" }
{ "response": "Muzeul Național, Ateneul Român, Parcul Herăstrău." }

Metode HTTP utilizate
Metodă	Endpoint	Descriere
POST	/register	Creare cont nou
POST	/login	Autentificare
GET	/tasks	Preluare task-uri
POST	/tasks	Adăugare task
DELETE	/tasks/{id}	Ștergere task
POST	/chat	ChatGPT interogare

Autentificare și autorizare servicii utilizate
•	Firebase Authentication:
o	Autentificare utilizator cu email și parolă
o	Generare token ID Firebase pentru sesiuni
o	Tokenul autoriză accesul la Firestore (task-uri) și alte servicii Firebase
•	OpenAI API:
o	Autentificare cu API key (inclusă în headerul HTTP Authorization: Bearer <API_KEY>)
o	Permite accesul securizat la endpoint-ul de chat




Capturi Ecran Aplicație
În acest capitul al lucrării voi prezenta funcționalitățile fiecărei pagini ale aplicației. 
Pagina de Login.












În prima pagină utilizatorul se poate loga cu credențialele sale, dacă acestea au fost înregistrate. În cazul în care utilizatorul este nou, va apărea un mesaj care anunță inexistența utilizatorului pentru ca acesta să acceseze pagina de înregistrare.

Pagina de Register
În pagina de Register se vor introduce adresa de email și parola utilizatorului pentru ca acestea să fie transmise în Firebase și să fie ulterior recunoscute în următoarele încercări. Parola trebuie să aibă minimum 6 caractere și va apărea un mesaj în cazul în care există deja un cont cu adresa de email sau parola respectivă









Meniul Principal








	


După ce logarea s-a realizat cu succes, primim acest mesaj și intrăm în meniul principal care are 4 butoane și un TextView care arată adresa de email cu care s-a logat utilizatorul. În această lucrare vom vorbi despre Butoanele „To Do List” și „Sights to See”. Butonul „To Do List” duce la pagina în care se pot trece informații importante precum remindere, atracții de vizitat, cumpărături de făcut, iar informația este stocată în Firebase Firestore. În „Sight to See” avem obiectivele turistice din București ce pot fi marcate, astfel încât utilizatorul să le poată identifica mai ușor atunci când caută informații cu ajutorul Chat GPT.
Pagina To Do List










	


În această pagină de pot adăuga task-uri și reminders cu ajutorul butonului + din partea dreaptă jos a ecranului. Este nevoie de o denumire pentru acestea, data este opțională, și fiecare element are un checkbox cu ajutorul căruia statusul este urmărit.
Modificare Task Existent
Exista posibilitatea să modificăm un task deja existent dacă glisăm la stânga pe task-ul respectiv. În această captură de ecran am surprins calendarul care apare utilizatorului atunci când dorește fie să selecteze data pentru un task nou, fie să modifice data unui task deja existent.









	

Ștergere Task Existent
Există posibilitatea să ștergem task-uri din listă, glisând la dreapta pe elementul pe care dorim să îl ștergem. După efectuarea acestei operațiuni apare un mesaj „Are you sure?” astfel încât țtergerea accidentală să poată fi evitată.








	
Pagina Sights to See


















	În această pagină, utilizatorul poate vedea atracțiile turistice din București și să le marcheze în cazul în care dorește să le viziteze. Pentru a răspunde la orice întrebări legate de itinerariu, atracție sau orice nelămurire am integrat ChatGPT ca să rezolve toate aceste probleme.


Concluzii
Lucrarea de față a urmărit dezvoltarea unei aplicații mobile menite să promoveze turismul în București, integrând concepte moderne precum turismul smart și tehnologii actuale precum Firebase și API-ul OpenAI. Analiza literaturii de specialitate a evidențiat importanța digitalizării în experiența turistică, iar partea practică a demonstrat modul în care o aplicație mobilă poate contribui la creșterea vizibilității destinațiilor locale.

Referințe
Gretzel, U., Sigala, M., Xiang, Z. et al. Smart tourism: foundations and developments. Electron Markets 25, 179–188 (2015). https://doi.org/10.1007/s12525-015-0196-8

![image](https://github.com/user-attachments/assets/c7997acf-7f3c-4578-8046-e8e3d69c7797)
