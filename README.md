# CPLEXexamples
Basic example of IBM Cplex application

Esercizio 1) Una ditta deve miscelare due detersivi per produrre un terzo che abbia determinate caratteristiche. I due detersivi contengono, fra le altre, le seguenti sostanze nella percentuale indicata in tabella:
Sostanze \ Detersivi	D1	D2	D3
Lubrificanti %	20	5	15
Carbonato di sodio %	6	30	12
Tensioattivi %	10	-	
Prezzo	€ 1,80	€ 2,00	

Il nuovo detersivo da produrre deve almeno il 15 % di sbiancanti il 12 % di carbonato di sodio e il 5% di tensioattivi. Il costo, per kg, del prodotto D1 è di € 1,80 e del prodotto D2 è €2. Determinare in quale parte devono essere impiegati D1 e D2 nella produzione del nuovo detersivo per ottenere il minimo costo.
min z = 1,80 x1 + 2x2
s.a. 20 x1 + 5x2 + >= 15
      6x1 + 5x2 >= 15
      10x1 >= 5
Esercizio 2) Un’industria fabbrica due prodotti, P1 e P2, che richiedono una lavorazione con la stessa macchina, in funzione 6 ore al giorno per 5 giorni alla settimana. Il prodotto P1 necessita di 10 minuti di lavorazione, mentre P2 ne richiede 30. Per ogni singolo prodotto di entrambi i tipi è necessario un accessorio, la cui disponibilità settimanale è di 100 unità. Il prodotto P1 viene venduto a € 80, mentre P2 viene venduta a € 120. Determinare la produzione settimanale che da il massimo ricavo.	
Prodotti \ Risorse	P1	P2	
Macchina	10 min	30 min	1800 min
Accessorio	1	1	100
Prezzo	€ 80	€ 120	

max z = 80 P1 + 120 P2
s.a. 10P1 +30P2 <= 1800
P1 + P2 <= 100
Esercizio 3) Una ditta fabbrica due tipi diversi di uno stesso prodotto. Per ogni tipo sono necessari 2kg di materia prima la cui disponibilità settimanale è di 120kg. Il primo tipo richiede 15 minuti di lavoro con una certa macchina A e un’ora di lavoro con una macchina B. Il secondo tipo richiede 45 minuti di lavoro con la machina A e 30 minuti con la macchina B. Le due macchine possono essere utilizzate 8 ore al giorno per cinque giorni alla settimana. Il ricavo per ogni oggetto del primo tipo è di €50, per il secondo tipo €60. Determinare la produzione settimanale che consente il massimo ricavo.
Prodotti \ Risorse	P1 x	P2 y	Quantità disponibile
Materia prima	2kg	2kg	120 kg
Macchina A	15 min	45 min	2400 min
Macchina B	60 min	30 min	2400 min
Ricavo	€ 50	€ 60	


max z = 50 x + 60 y
s.a. 2 x + 2 y <= 120
       15 x + 45 y <= 2400
       60 x + 30 y <= 2400


