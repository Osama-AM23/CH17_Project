package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collection.dto.CountryDTO;
import com.xworkz.collection.enums.Code;
import com.xworkz.collection.enums.Continent;

public class CountryRunner {

	public static void main(String[] args) {

		CountryDTO DTO1 = new CountryDTO("AFGHANISTAN", Code.AFG, 38928346L, "Hibatullah Akhundzada", Continent.ASIA);
		CountryDTO DTO2 = new CountryDTO("ALBANIA", Code.ALB, 2877797L, "Bajram Begaj", Continent.EUROPE);
		CountryDTO DTO3 = new CountryDTO("ALGERIA", Code.DZA, 43851044L, "Abdelmadjid Tebboune", Continent.AFRICA);
		CountryDTO DTO4 = new CountryDTO("ANDORRA", Code.AND, 77265L, "Xavier Espot Zamora", Continent.EUROPE);
		CountryDTO DTO5 = new CountryDTO("ANGOLA", Code.AGO, 32866272L, "João Lourenço", Continent.AFRICA);
		CountryDTO DTO6 = new CountryDTO("ANTIGUA AND BARBUDA", Code.ATG, 97929L, "Gaston Browne",Continent.NORTH_AMERICA);
		CountryDTO DTO7 = new CountryDTO("ARGENTINA", Code.ARG, 45195774L, "Alberto Fernández",Continent.SOUTH_AMERICA);
		CountryDTO DTO8 = new CountryDTO("ARMENIA", Code.ARM, 2963243L, "Vahagn Khachaturyan", Continent.ASIA);
		CountryDTO DTO9 = new CountryDTO("AUSTRALIA", Code.AUS, 25499884L, "Peter Dutton", Continent.OCEANIA);
		CountryDTO DTO10 = new CountryDTO("AUSTRIA", Code.AUT, 9006398L, "Alexander Van der Bellen", Continent.EUROPE);
		CountryDTO DTO11 = new CountryDTO("AZERBAIJAN", Code.AZE, 10139177L, "Ilham Aliyev", Continent.ASIA);
		CountryDTO DTO12 = new CountryDTO("BAHAMAS", Code.BHS, 393248L, "Philip Davis", Continent.NORTH_AMERICA);
		CountryDTO DTO13 = new CountryDTO("BAHRAIN", Code.BHR, 1701575L, "Hamad bin Isa Al Khalifa", Continent.ASIA);
		CountryDTO DTO14 = new CountryDTO("BANGLADESH", Code.BGD, 164689383L, "Mohammed Shahabuddin", Continent.ASIA);
		CountryDTO DTO15 = new CountryDTO("BARBADOS", Code.BRB, 287375L, "Sandra Mason", Continent.NORTH_AMERICA);
		CountryDTO DTO16 = new CountryDTO("BELARUS", Code.BLR, 9449323L, "Alexander Lukashenko", Continent.EUROPE);
		CountryDTO DTO17 = new CountryDTO("BELGIUM", Code.BEL, 11589623L, "Alexander De Croo", Continent.EUROPE);
		CountryDTO DTO18 = new CountryDTO("BELIZE", Code.BLZ, 397621L, "Bernard Wagner", Continent.NORTH_AMERICA);
		CountryDTO DTO19 = new CountryDTO("BENIN", Code.BEN, 12123200L, "Patrice Talon", Continent.AFRICA);
		CountryDTO DTO20 = new CountryDTO("BHUTAN", Code.BTN, 771608L, "Lotay Tshering", Continent.ASIA);
		CountryDTO DTO21 = new CountryDTO("BOLIVIA", Code.BOL, 11673021L, "Luis Arce", Continent.SOUTH_AMERICA);
		CountryDTO DTO22 = new CountryDTO("BOSNIA AND HERZEGOVINA", Code.BIH, 3280819L, "Šefik Džaferović",Continent.EUROPE);
		CountryDTO DTO23 = new CountryDTO("BOTSWANA", Code.BWA, 2141206L, "Mokgweetsi Masisi", Continent.AFRICA);
		CountryDTO DTO24 = new CountryDTO("BRAZIL", Code.BRA, 211049527L, "Luiz Inácio Lula da Silva",
				Continent.SOUTH_AMERICA);
		CountryDTO DTO25 = new CountryDTO("BRUNEI", Code.BRN, 437483L, "Sultan Hassanal Bolkiah", Continent.ASIA);
		CountryDTO DTO26 = new CountryDTO("BULGARIA", Code.BGR, 6948445L, "Rumen Radev", Continent.EUROPE);
		CountryDTO DTO27 = new CountryDTO("BURKINA FASO", Code.BFA, 19034397L, "Roch Marc Christian Kaboré",
				Continent.AFRICA);
		CountryDTO DTO28 = new CountryDTO("BURUNDI", Code.BDI, 10114505L, "Evariste Ndayishimiye", Continent.AFRICA);
		CountryDTO DTO29 = new CountryDTO("CABO VERDE", Code.CPV, 531239L, "Jorge Carlos Fonseca", Continent.AFRICA);
		CountryDTO DTO30 = new CountryDTO("CAMBODIA", Code.KHM, 16718971L, "Hun Sen", Continent.ASIA);
		CountryDTO DTO31 = new CountryDTO("CANADA", Code.CAN, 37742154L, "Justin Trudeau", Continent.NORTH_AMERICA);
		CountryDTO DTO32 = new CountryDTO("CENTRAL AFRICAN REPUBLIC", Code.CAF, 4829767L, "Faustin-Archange Touadéra",
				Continent.AFRICA);
		CountryDTO DTO33 = new CountryDTO("CHAD", Code.TCD, 16425864L, "Mahamat Déby", Continent.AFRICA);
		CountryDTO DTO34 = new CountryDTO("CHILE", Code.CHL, 19116201L, "Sebastián Piñera", Continent.SOUTH_AMERICA);
		CountryDTO DTO35 = new CountryDTO("CHINA", Code.CHN, 1439323776L, "Xi Jinping", Continent.ASIA);
		CountryDTO DTO36 = new CountryDTO("COLOMBIA", Code.COL, 50882891L, "Iván Duque Márquez",
				Continent.SOUTH_AMERICA);
		CountryDTO DTO37 = new CountryDTO("COMOROS", Code.COM, 869601L, "Azali Assoumani", Continent.AFRICA);
		CountryDTO DTO38 = new CountryDTO("CONGO, DEMOCRATIC REPUBLIC OF THE", Code.COG, 89561403L, "Félix Tshisekedi",
				Continent.AFRICA);
		CountryDTO DTO39 = new CountryDTO("CONGO, REPUBLIC OF THE", Code.COG, 5518092L, "Denis Sassou Nguesso",
				Continent.AFRICA);
		CountryDTO DTO40 = new CountryDTO("COSTA RICA", Code.CRI, 5094118L, "Carlos Alvarado Quesada",
				Continent.NORTH_AMERICA);
		CountryDTO DTO41 = new CountryDTO("CROATIA", Code.HRV, 4105267L, "Zoran Milanović", Continent.EUROPE);
		CountryDTO DTO42 = new CountryDTO("CUBA", Code.CUB, 11326616L, "Miguel Díaz-Canel", Continent.NORTH_AMERICA);
		CountryDTO DTO43 = new CountryDTO("CYPRUS", Code.CYP, 1207359L, "Nikos Anastasiades", Continent.EUROPE);
		CountryDTO DTO44 = new CountryDTO("CZECHIA", Code.CZE, 10708981L, "Miloš Zeman", Continent.EUROPE);
		CountryDTO DTO45 = new CountryDTO("DENMARK", Code.DNK, 5818553L, "Mette Frederiksen", Continent.EUROPE);
		CountryDTO DTO46 = new CountryDTO("DJIBOUTI", Code.DJI, 988000L, "Ismaïl Omar Guelleh", Continent.AFRICA);
		CountryDTO DTO47 = new CountryDTO("DOMINICA", Code.DMA, 71986L, "Roosevelt Skerrit", Continent.NORTH_AMERICA);
		CountryDTO DTO48 = new CountryDTO("DOMINICAN REPUBLIC", Code.DOM, 10847910L, "Luis Abinader",
				Continent.NORTH_AMERICA);
		CountryDTO DTO49 = new CountryDTO("ECUADOR", Code.ECU, 17643054L, "Guillermo Lasso", Continent.SOUTH_AMERICA);
		CountryDTO DTO50 = new CountryDTO("EGYPT", Code.EGY, 102334404L, "Abdel Fattah el-Sisi", Continent.AFRICA);
		CountryDTO DTO51 = new CountryDTO("EL SALVADOR", Code.SLV, 6486205L, "Nayib Bukele", Continent.NORTH_AMERICA);
		CountryDTO DTO52 = new CountryDTO("EQUATORIAL GUINEA", Code.GNQ, 1402985L, "Teodoro Obiang Nguema Mbasogo",
				Continent.AFRICA);
		CountryDTO DTO53 = new CountryDTO("ERITREA", Code.ERI, 3546000L, "Isaias Afwerki", Continent.AFRICA);
		CountryDTO DTO54 = new CountryDTO("ESTONIA", Code.EST, 1326535L, "Kersti Kaljulaid", Continent.EUROPE);
		CountryDTO DTO55 = new CountryDTO("ESWATINI", Code.SWZ, 1160164L, "Mswati III", Continent.AFRICA);
		CountryDTO DTO56 = new CountryDTO("ETHIOPIA", Code.ETH, 114963588L, "Abiy Ahmed", Continent.AFRICA);
		CountryDTO DTO57 = new CountryDTO("FIJI", Code.FJI, 896445L, "Jioji Konrote", Continent.OCEANIA);
		CountryDTO DTO58 = new CountryDTO("FINLAND", Code.FIN, 5540720L, "Sauli Niinistö", Continent.EUROPE);
		CountryDTO DTO59 = new CountryDTO("FRANCE", Code.FRA, 65273511L, "Emmanuel Macron", Continent.EUROPE);
		CountryDTO DTO60 = new CountryDTO("GABON", Code.GAB, 2225734L, "Ali Bongo Ondimba", Continent.AFRICA);
		CountryDTO DTO61 = new CountryDTO("GAMBIA", Code.GMB, 2416668L, "Adama Barrow", Continent.AFRICA);
		CountryDTO DTO62 = new CountryDTO("GEORGIA", Code.GEO, 3989167L, "Salome Zourabichvili", Continent.EUROPE);
		CountryDTO DTO63 = new CountryDTO("GERMANY", Code.DEU, 83783942L, "Frank-Walter Steinmeier", Continent.EUROPE);
		CountryDTO DTO64 = new CountryDTO("GHANA", Code.GHA, 31072940L, "Nana Akufo-Addo", Continent.AFRICA);
		CountryDTO DTO65 = new CountryDTO("GREECE", Code.GRC, 10423054L, "Katerina Sakellaropoulou", Continent.EUROPE);
		CountryDTO DTO66 = new CountryDTO("GRENADA", Code.GRD, 112523L, "Keith Mitchell", Continent.NORTH_AMERICA);
		CountryDTO DTO67 = new CountryDTO("GUATEMALA", Code.GTM, 17915568L, "Alejandro Giammattei",
				Continent.NORTH_AMERICA);
		CountryDTO DTO68 = new CountryDTO("GUINEA", Code.GIN, 13132795L, "Alpha Condé", Continent.AFRICA);
		CountryDTO DTO69 = new CountryDTO("GUINEA-BISSAU", Code.GNB, 1968001L, "Umaro Sissoco Embaló",
				Continent.AFRICA);
		CountryDTO DTO70 = new CountryDTO("GUYANA", Code.GUY, 786552L, "Irfaan Ali", Continent.SOUTH_AMERICA);
		CountryDTO DTO71 = new CountryDTO("HAITI", Code.HTI, 11402528L, "Jovenel Moïse", Continent.NORTH_AMERICA);
		CountryDTO DTO72 = new CountryDTO("HONDURAS", Code.HND, 9904608L, "Juan Orlando Hernández",
				Continent.NORTH_AMERICA);
		CountryDTO DTO73 = new CountryDTO("HUNGARY", Code.HUN, 9660351L, "János Áder", Continent.EUROPE);
		CountryDTO DTO74 = new CountryDTO("ICELAND", Code.ISL, 341243L, "Guðni Th. Jóhannesson", Continent.EUROPE);
		CountryDTO DTO75 = new CountryDTO("INDIA", Code.IND, 1380004385L, "Ram Nath Kovind", Continent.ASIA);
		CountryDTO DTO76 = new CountryDTO("INDONESIA", Code.IDN, 273523615L, "Joko Widodo", Continent.ASIA);
		CountryDTO DTO77 = new CountryDTO("IRAN", Code.IRN, 83992949L, "Hassan Rouhani", Continent.ASIA);
		CountryDTO DTO78 = new CountryDTO("IRAQ", Code.IRQ, 40222493L, "Barham Salih", Continent.ASIA);
		CountryDTO DTO79 = new CountryDTO("IRELAND", Code.IRL, 4937786L, "Michael D. Higgins", Continent.EUROPE);
		CountryDTO DTO80 = new CountryDTO("ISRAEL", Code.ISR, 8655535L, "Reuven Rivlin", Continent.ASIA);
		CountryDTO DTO81 = new CountryDTO("ITALY", Code.ITA, 60244639L, "Sergio Mattarella", Continent.EUROPE);
		CountryDTO DTO82 = new CountryDTO("JAMAICA", Code.JAM, 2961167L, "Andrew Holness", Continent.NORTH_AMERICA);
		CountryDTO DTO83 = new CountryDTO("JAPAN", Code.JPN, 126476461L, "Yoshihide Suga", Continent.ASIA);
		CountryDTO DTO84 = new CountryDTO("JORDAN", Code.JOR, 10203134L, "Abdullah II", Continent.ASIA);
		CountryDTO DTO85 = new CountryDTO("KAZAKHSTAN", Code.KAZ, 18776707L, "Kassym-Jomart Tokayev", Continent.ASIA);
		CountryDTO DTO86 = new CountryDTO("KENYA", Code.KEN, 53771296L, "Uhuru Kenyatta", Continent.AFRICA);
		CountryDTO DTO87 = new CountryDTO("KIRIBATI", Code.KIR, 119446L, "Taneti Maamau", Continent.OCEANIA);
		CountryDTO DTO88 = new CountryDTO("KOSOVO", Code.KOR, 1831000L, "Vjosa Osmani", Continent.EUROPE);
		CountryDTO DTO89 = new CountryDTO("KUWAIT", Code.KWT, 4270571L, "Nawaf Al-Ahmad Al-Jaber Al-Sabah",
				Continent.ASIA);
		CountryDTO DTO90 = new CountryDTO("KYRGYZSTAN", Code.KGZ, 6524195L, "Sadyr Japarov", Continent.ASIA);
		CountryDTO DTO91 = new CountryDTO("LAOS", Code.LAO, 7275560L, "Thongloun Sisoulith", Continent.ASIA);
		CountryDTO DTO92 = new CountryDTO("LATVIA", Code.LVA, 1886198L, "Egils Levits", Continent.EUROPE);
		CountryDTO DTO93 = new CountryDTO("LEBANON", Code.LBN, 6825445L, "Michel Aoun", Continent.ASIA);
		CountryDTO DTO94 = new CountryDTO("LESOTHO", Code.LSO, 2142249L, "Moeketsi Majoro", Continent.AFRICA);
		CountryDTO DTO95 = new CountryDTO("LIBERIA", Code.LBR, 5057681L, "George Weah", Continent.AFRICA);
		CountryDTO DTO96 = new CountryDTO("LIBYA", Code.LBY, 6871292L, "Mohamed al-Menfi", Continent.AFRICA);
		CountryDTO DTO97 = new CountryDTO("LIECHTENSTEIN", Code.LIE, 38128L,
				"Alois, Hereditary Prince of Liechtenstein", Continent.EUROPE);
		CountryDTO DTO98 = new CountryDTO("LITHUANIA", Code.LTU, 2722289L, "Gitanas Nausėda", Continent.EUROPE);
		CountryDTO DTO99 = new CountryDTO("LUXEMBOURG", Code.LUX, 634814L, "Xavier Bettel", Continent.EUROPE);
		CountryDTO DTO100 = new CountryDTO("MADAGASCAR", Code.MDG, 27691018L, "Andry Rajoelina", Continent.AFRICA);
		CountryDTO DTO101 = new CountryDTO("MALAWI", Code.MWI, 19129952L, "Lazarus Chakwera", Continent.AFRICA);
		CountryDTO DTO102 = new CountryDTO("MALAYSIA", Code.MYS, 32365999L, "Muhyiddin Yassin", Continent.ASIA);
		CountryDTO DTO103 = new CountryDTO("MALDIVES", Code.MDV, 540544L, "Ibrahim Mohamed Solih", Continent.ASIA);
		CountryDTO DTO104 = new CountryDTO("MALI", Code.MLI, 20250833L, "Bah N'Daw", Continent.AFRICA);
		CountryDTO DTO105 = new CountryDTO("MALTA", Code.MLT, 514564L, "George Vella", Continent.EUROPE);
		CountryDTO DTO106 = new CountryDTO("MARSHALL ISLANDS", Code.MHL, 59190L, "David Kabua", Continent.OCEANIA);
		CountryDTO DTO107 = new CountryDTO("MAURITANIA", Code.MRT, 4649658L, "Mohamed Ould Ghazouani",
				Continent.AFRICA);
		CountryDTO DTO108 = new CountryDTO("MAURITIUS", Code.MUS, 1271768L, "Prithvirajsing Roopun", Continent.AFRICA);
		CountryDTO DTO109 = new CountryDTO("MEXICO", Code.MEX, 128932753L, "Andrés Manuel López Obrador",
				Continent.NORTH_AMERICA);
		CountryDTO DTO110 = new CountryDTO("MICRONESIA", Code.FSM, 115023L, "David Panuelo", Continent.OCEANIA);
		CountryDTO DTO111 = new CountryDTO("MOLDOVA", Code.MDA, 2657637L, "Maia Sandu", Continent.EUROPE);
		CountryDTO DTO112 = new CountryDTO("MONACO", Code.MCO, 39242L, "Albert II", Continent.EUROPE);
		CountryDTO DTO113 = new CountryDTO("MONGOLIA", Code.MNG, 3278290L, "Khaltmaagiin Battulga", Continent.ASIA);
		CountryDTO DTO114 = new CountryDTO("MONTENEGRO", Code.MNG, 622359L, "Milo Đukanović", Continent.EUROPE);
		CountryDTO DTO115 = new CountryDTO("MOROCCO", Code.MAR, 36910560L, "Mohammed VI", Continent.AFRICA);
		CountryDTO DTO116 = new CountryDTO("MOZAMBIQUE", Code.MOZ, 31255435L, "Filipe Nyusi", Continent.AFRICA);
		CountryDTO DTO117 = new CountryDTO("MYANMAR", Code.MMR, 54409800L, "Min Aung Hlaing", Continent.ASIA);
		CountryDTO DTO118 = new CountryDTO("NAMIBIA", Code.NAM, 2540905L, "Hage Geingob", Continent.AFRICA);
		CountryDTO DTO119 = new CountryDTO("NAURU", Code.NRU, 10824L, "Lionel Aingimea", Continent.OCEANIA);
		CountryDTO DTO120 = new CountryDTO("NEPAL", Code.NPL, 29136808L, "Bidhya Devi Bhandari", Continent.ASIA);
		CountryDTO DTO121 = new CountryDTO("NETHERLANDS", Code.NLD, 17134872L, "Willem-Alexander", Continent.EUROPE);
		CountryDTO DTO122 = new CountryDTO("NEW ZEALAND", Code.NZL, 4822233L, "Jacinda Ardern", Continent.OCEANIA);
		CountryDTO DTO123 = new CountryDTO("NICARAGUA", Code.NIC, 6624554L, "Daniel Ortega", Continent.NORTH_AMERICA);
		CountryDTO DTO124 = new CountryDTO("NIGER", Code.NER, 24206644L, "Mohamed Bazoum", Continent.AFRICA);
		CountryDTO DTO125 = new CountryDTO("NIGERIA", Code.NGA, 206139589L, "Muhammadu Buhari", Continent.AFRICA);
		CountryDTO DTO126 = new CountryDTO("NORTH KOREA", Code.PRK, 25778816L, "Kim Jong-un", Continent.ASIA);
		CountryDTO DTO127 = new CountryDTO("NORTH MACEDONIA", Code.MKD, 2083459L, "Stevo Pendarovski",
				Continent.EUROPE);
		CountryDTO DTO128 = new CountryDTO("NORWAY", Code.NOR, 5421241L, "Erna Solberg", Continent.EUROPE);
		CountryDTO DTO129 = new CountryDTO("OMAN", Code.OMN, 5106626L, "Haitham bin Tariq", Continent.ASIA);
		CountryDTO DTO130 = new CountryDTO("PAKISTAN", Code.PAK, 220892340L, "Arif Alvi", Continent.ASIA);
		CountryDTO DTO131 = new CountryDTO("PALAU", Code.PLW, 18094L, "Surangel Whipps Jr.", Continent.OCEANIA);
		CountryDTO DTO132 = new CountryDTO("PALESTINE", Code.PLW, 5101414L, "Mahmoud Abbas", Continent.ASIA);
		CountryDTO DTO133 = new CountryDTO("PANAMA", Code.PAN, 4314767L, "Laurentino Cortizo", Continent.NORTH_AMERICA);
		CountryDTO DTO134 = new CountryDTO("PAPUA NEW GUINEA", Code.PNG, 8947027L, "James Marape", Continent.OCEANIA);
		CountryDTO DTO135 = new CountryDTO("PARAGUAY", Code.PRY, 7132538L, "Mario Abdo Benítez",
				Continent.SOUTH_AMERICA);
		CountryDTO DTO136 = new CountryDTO("PERU", Code.PER, 32971854L, "Francisco Sagasti", Continent.SOUTH_AMERICA);
		CountryDTO DTO137 = new CountryDTO("PHILIPPINES", Code.PHL, 109581078L, "Rodrigo Duterte", Continent.ASIA);
		CountryDTO DTO138 = new CountryDTO("POLAND", Code.POL, 38386000L, "Andrzej Duda", Continent.EUROPE);
		CountryDTO DTO139 = new CountryDTO("PORTUGAL", Code.PRT, 10196709L, "Marcelo Rebelo de Sousa",
				Continent.EUROPE);
		CountryDTO DTO140 = new CountryDTO("QATAR", Code.QAT, 2881053L, "Tamim bin Hamad Al Thani", Continent.ASIA);
		CountryDTO DTO141 = new CountryDTO("ROMANIA", Code.ROM, 19237691L, "Klaus Iohannis", Continent.EUROPE);
		CountryDTO DTO142 = new CountryDTO("RUSSIA", Code.RUS, 145912025L, "Vladimir Putin", Continent.EUROPE);
		CountryDTO DTO143 = new CountryDTO("RWANDA", Code.RWA, 12952218L, "Paul Kagame", Continent.AFRICA);
		CountryDTO DTO144 = new CountryDTO("SAINT KITTS AND NEVIS", Code.KNA, 53199L, "Timothy Harris",
				Continent.NORTH_AMERICA);
		CountryDTO DTO145 = new CountryDTO("SAINT LUCIA", Code.LCA, 183627L, "Philip J. Pierre",
				Continent.NORTH_AMERICA);
		CountryDTO DTO146 = new CountryDTO("SAINT VINCENT AND THE GRENADINES", Code.VCT, 110940L, "Ralph Gonsalves",
				Continent.AFRICA);
		CountryDTO DTO147 = new CountryDTO("SAMOA", Code.WSM, 198410L, "Naomi Mataʻafa", Continent.OCEANIA);
		CountryDTO DTO148 = new CountryDTO("SAN MARINO", Code.SMR, 33931L, "Gian Carlo Venturini", Continent.EUROPE);
		CountryDTO DTO149 = new CountryDTO("SAO TOME AND PRINCIPE", Code.STP, 219159L, "Evaristo Carvalho",
				Continent.AFRICA);
		CountryDTO DTO150 = new CountryDTO("SAUDI ARABIA", Code.SAU, 34813871L, "Salman bin Abdulaziz Al Saud",
				Continent.ASIA);
		CountryDTO DTO151 = new CountryDTO("SENEGAL", Code.SEN, 16743927L, "Macky Sall", Continent.AFRICA);
		CountryDTO DTO152 = new CountryDTO("SERBIA", Code.SER, 8772235L, "Aleksandar Vučić", Continent.EUROPE);
		CountryDTO DTO153 = new CountryDTO("SEYCHELLES", Code.SYC, 98347L, "Wavel Ramkalawan", Continent.AFRICA);
		CountryDTO DTO154 = new CountryDTO("SIERRA LEONE", Code.SLE, 7976983L, "Julius Maada Bio", Continent.AFRICA);
		CountryDTO DTO155 = new CountryDTO("SINGAPORE", Code.SGP, 5850342L, "Halimah Yacob", Continent.ASIA);
		CountryDTO DTO156 = new CountryDTO("SLOVAKIA", Code.SVK, 5456362L, "Zuzana Čaputová", Continent.EUROPE);
		CountryDTO DTO157 = new CountryDTO("SLOVENIA", Code.SVN, 2078654L, "Borut Pahor", Continent.EUROPE);
		CountryDTO DTO158 = new CountryDTO("SOLOMON ISLANDS", Code.SLB, 686884L, "Manasseh Sogavare",
				Continent.OCEANIA);
		CountryDTO DTO159 = new CountryDTO("SOMALIA", Code.SOM, 15893222L, "Mohamed Abdullahi Mohamed",
				Continent.AFRICA);
		CountryDTO DTO160 = new CountryDTO("SOUTH AFRICA", Code.ZAF, 59308690L, "Cyril Ramaphosa", Continent.AFRICA);
		CountryDTO DTO161 = new CountryDTO("SOUTH KOREA", Code.KOR, 51269185L, "Moon Jae-in", Continent.ASIA);
		CountryDTO DTO162 = new CountryDTO("SOUTH SUDAN", Code.SAU, 11193725L, "Salva Kiir Mayardit", Continent.AFRICA);
		CountryDTO DTO163 = new CountryDTO("SPAIN", Code.ESP, 46754778L, "Pedro Sánchez", Continent.EUROPE);
		CountryDTO DTO164 = new CountryDTO("SRI LANKA", Code.LKA, 21413249L, "Gotabaya Rajapaksa", Continent.ASIA);
		CountryDTO DTO165 = new CountryDTO("SUDAN", Code.SDN, 43849260L, "Abdalla Hamdok", Continent.AFRICA);
		CountryDTO DTO166 = new CountryDTO("SURINAME", Code.SUR, 586632L, "Chandrikapersad Santokhi",
				Continent.SOUTH_AMERICA);
		CountryDTO DTO167 = new CountryDTO("SWEDEN", Code.SWE, 10353442L, "Stefan Löfven", Continent.EUROPE);
		CountryDTO DTO168 = new CountryDTO("SWITZERLAND", Code.CHE, 8654622L, "Guy Parmelin", Continent.EUROPE);
		CountryDTO DTO169 = new CountryDTO("SYRIA", Code.SYR, 17500658L, "Bashar al-Assad", Continent.ASIA);
		CountryDTO DTO170 = new CountryDTO("TAIWAN", Code.TWN, 23816775L, "Tsai Ing-wen", Continent.ASIA);
		CountryDTO DTO171 = new CountryDTO("TAJIKISTAN", Code.TJK, 9537645L, "Emomali Rahmon", Continent.ASIA);
		CountryDTO DTO172 = new CountryDTO("TANZANIA", Code.TZA, 59734218L, "Samia Suluhu Hassan", Continent.AFRICA);
		CountryDTO DTO173 = new CountryDTO("THAILAND", Code.THA, 69799978L, "Prayut Chan-o-cha", Continent.ASIA);
		CountryDTO DTO174 = new CountryDTO("TIMOR-LESTE", Code.TKL, 1318445L, "Francisco Guterres", Continent.ASIA);
		CountryDTO DTO175 = new CountryDTO("TOGO", Code.TGO, 8278724L, "Faure Gnassingbé", Continent.AFRICA);
		CountryDTO DTO176 = new CountryDTO("TONGA", Code.TON, 105695L, "Tupou VI", Continent.OCEANIA);
		CountryDTO DTO177 = new CountryDTO("TRINIDAD AND TOBAGO", Code.TTO, 1399488L, "Paula-Mae Weekes",
				Continent.NORTH_AMERICA);
		CountryDTO DTO178 = new CountryDTO("TUNISIA", Code.TUN, 11818618L, "Kais Saied", Continent.AFRICA);
		CountryDTO DTO179 = new CountryDTO("TURKEY", Code.TUR, 84339067L, "Recep Tayyip Erdoğan", Continent.ASIA);
		CountryDTO DTO180 = new CountryDTO("TURKMENISTAN", Code.TKM, 6031187L, "Gurbanguly Berdimuhamedow",
				Continent.ASIA);
		CountryDTO DTO181 = new CountryDTO("TUVALU", Code.TUV, 11792L, "Kausea Natano", Continent.OCEANIA);
		CountryDTO DTO182 = new CountryDTO("UGANDA", Code.UGA, 45741007L, "Yoweri Museveni", Continent.AFRICA);
		CountryDTO DTO183 = new CountryDTO("UKRAINE", Code.UKR, 44134693L, "Volodymyr Zelensky", Continent.EUROPE);
		CountryDTO DTO184 = new CountryDTO("UNITED ARAB EMIRATES", Code.ARE, 9890402L, "Khalifa bin Zayed Al Nahyan",
				Continent.ASIA);
		CountryDTO DTO185 = new CountryDTO("UNITED KINGDOM", Code.GBR, 67886011L, "Queen Elizabeth II",
				Continent.EUROPE);
		CountryDTO DTO186 = new CountryDTO("UNITED STATES", Code.USA, 331002651L, "Joe Biden", Continent.AFRICA);
		CountryDTO DTO187 = new CountryDTO("URUGUAY", Code.URY, 3473730L, "Luis Lacalle Pou", Continent.SOUTH_AMERICA);
		CountryDTO DTO188 = new CountryDTO("UZBEKISTAN", Code.UZB, 33469203L, "Shavkat Mirziyoyev", Continent.ASIA);
		CountryDTO DTO189 = new CountryDTO("VANUATU", Code.VUT, 307150L, "Tallus Stephen", Continent.OCEANIA);
		CountryDTO DTO190 = new CountryDTO("VATICAN CITY", Code.VAT, 801L, "Pope Francis", Continent.EUROPE);
		CountryDTO DTO191 = new CountryDTO("VENEZUELA", Code.VEN, 28435940L, "Nicolás Maduro", Continent.SOUTH_AMERICA);
		CountryDTO DTO192 = new CountryDTO("VIETNAM", Code.VNM, 97338579L, "Nguyễn Phú Trọng", Continent.ASIA);
		CountryDTO DTO193 = new CountryDTO("YEMEN", Code.YEM, 29825964L, "Abdrabbuh Mansur Hadi", Continent.ASIA);
		CountryDTO DTO194 = new CountryDTO("ZAMBIA", Code.ZMB, 18383955L, "Edgar Lungu", Continent.AFRICA);
		CountryDTO DTO195 = new CountryDTO("ZIMBABWE", Code.ZWE, 14862924L, "Emmerson Mnangagwa", Continent.AFRICA);

		Collection<CountryDTO> collection = new LinkedList<CountryDTO>();

		collection.add(DTO1);
		collection.add(DTO2);
		collection.add(DTO3);
		collection.add(DTO4);
		collection.add(DTO5);
		collection.add(DTO6);
		collection.add(DTO7);
		collection.add(DTO8);
		collection.add(DTO9);
		collection.add(DTO10);

		collection.add(DTO11);
		collection.add(DTO12);
		collection.add(DTO13);
		collection.add(DTO14);
		collection.add(DTO15);
		collection.add(DTO16);
		collection.add(DTO17);
		collection.add(DTO18);
		collection.add(DTO19);
		collection.add(DTO20);

		collection.add(DTO21);
		collection.add(DTO22);
		collection.add(DTO23);
		collection.add(DTO24);
		collection.add(DTO25);
		collection.add(DTO26);
		collection.add(DTO27);
		collection.add(DTO28);
		collection.add(DTO29);
		collection.add(DTO30);

		collection.add(DTO30);
		collection.add(DTO31);
		collection.add(DTO32);
		collection.add(DTO33);
		collection.add(DTO34);
		collection.add(DTO35);
		collection.add(DTO36);
		collection.add(DTO37);
		collection.add(DTO38);
		collection.add(DTO39);
		collection.add(DTO40);

		collection.add(DTO41);
		collection.add(DTO42);
		collection.add(DTO43);
		collection.add(DTO44);
		collection.add(DTO45);
		collection.add(DTO46);
		collection.add(DTO47);
		collection.add(DTO48);
		collection.add(DTO49);
		collection.add(DTO50);

		collection.add(DTO51);
		collection.add(DTO52);
		collection.add(DTO53);
		collection.add(DTO54);
		collection.add(DTO55);
		collection.add(DTO56);
		collection.add(DTO57);
		collection.add(DTO58);
		collection.add(DTO59);
		collection.add(DTO60);

		collection.add(DTO61);
		collection.add(DTO62);
		collection.add(DTO63);
		collection.add(DTO64);
		collection.add(DTO65);
		collection.add(DTO66);
		collection.add(DTO67);
		collection.add(DTO68);
		collection.add(DTO69);
		collection.add(DTO70);

		collection.add(DTO71);
		collection.add(DTO72);
		collection.add(DTO73);
		collection.add(DTO74);
		collection.add(DTO75);
		collection.add(DTO76);
		collection.add(DTO77);
		collection.add(DTO78);
		collection.add(DTO79);
		collection.add(DTO80);

		collection.add(DTO81);
		collection.add(DTO82);
		collection.add(DTO83);
		collection.add(DTO84);
		collection.add(DTO85);
		collection.add(DTO86);
		collection.add(DTO87);
		collection.add(DTO88);
		collection.add(DTO89);
		collection.add(DTO90);

		collection.add(DTO91);
		collection.add(DTO92);
		collection.add(DTO93);
		collection.add(DTO94);
		collection.add(DTO95);
		collection.add(DTO96);
		collection.add(DTO97);
		collection.add(DTO98);
		collection.add(DTO99);
		collection.add(DTO100);

		collection.add(DTO101);
		collection.add(DTO102);
		collection.add(DTO103);
		collection.add(DTO104);
		collection.add(DTO105);
		collection.add(DTO106);
		collection.add(DTO107);
		collection.add(DTO108);
		collection.add(DTO109);
		collection.add(DTO110);

		collection.add(DTO111);
		collection.add(DTO112);
		collection.add(DTO113);
		collection.add(DTO114);
		collection.add(DTO115);
		collection.add(DTO116);
		collection.add(DTO117);
		collection.add(DTO118);
		collection.add(DTO119);
		collection.add(DTO120);

		collection.add(DTO121);
		collection.add(DTO122);
		collection.add(DTO123);
		collection.add(DTO124);
		collection.add(DTO125);
		collection.add(DTO126);
		collection.add(DTO127);
		collection.add(DTO128);
		collection.add(DTO129);
		collection.add(DTO130);

		collection.add(DTO131);
		collection.add(DTO132);
		collection.add(DTO133);
		collection.add(DTO134);
		collection.add(DTO135);
		collection.add(DTO136);
		collection.add(DTO137);
		collection.add(DTO138);
		collection.add(DTO139);
		collection.add(DTO140);

		collection.add(DTO141);
		collection.add(DTO142);
		collection.add(DTO143);
		collection.add(DTO144);
		collection.add(DTO145);
		collection.add(DTO146);
		collection.add(DTO147);
		collection.add(DTO148);
		collection.add(DTO149);
		collection.add(DTO150);

		collection.add(DTO151);
		collection.add(DTO152);
		collection.add(DTO153);
		collection.add(DTO154);
		collection.add(DTO155);
		collection.add(DTO156);
		collection.add(DTO157);
		collection.add(DTO158);
		collection.add(DTO159);
		collection.add(DTO160);

		collection.add(DTO161);
		collection.add(DTO162);
		collection.add(DTO163);
		collection.add(DTO164);
		collection.add(DTO165);
		collection.add(DTO166);
		collection.add(DTO167);
		collection.add(DTO168);
		collection.add(DTO169);
		collection.add(DTO170);

		collection.add(DTO171);
		collection.add(DTO172);
		collection.add(DTO173);
		collection.add(DTO174);
		collection.add(DTO175);
		collection.add(DTO176);
		collection.add(DTO177);
		collection.add(DTO178);
		collection.add(DTO179);
		collection.add(DTO180);

		collection.add(DTO181);
		collection.add(DTO182);
		collection.add(DTO183);
		collection.add(DTO184);
		collection.add(DTO185);
		collection.add(DTO186);
		collection.add(DTO187);
		collection.add(DTO188);
		collection.add(DTO189);
		collection.add(DTO190);
		collection.add(DTO191);
		collection.add(DTO192);
		collection.add(DTO193);
		collection.add(DTO194);
		collection.add(DTO195);

		Iterator<CountryDTO> iterator = collection.iterator();

		while (iterator.hasNext()) {
			CountryDTO country = iterator.next();
			//country name where population is greater than 25CR
			if (country.getPopulation() > 250000000L) {
				System.out.println("Country names who's population is more than 250000000L:" + country.getName());
			}

		}
		System.out.println();

		Iterator<CountryDTO> iterator1 = collection.iterator();

		while (iterator1.hasNext()) {
			CountryDTO country = iterator1.next();
			System.out.println(country.getName() + "- " + country.getPresidentName());
		}

		Iterator<CountryDTO> iterator2 = collection.iterator();

		while (iterator2.hasNext()) {
			CountryDTO country = iterator2.next();
			//countries where country code is less than 50
			if (country.getCode().ordinal() < 50) {
				System.out.println(country.getName() + "-" + country.getCode().getCodeValue());
			}
		}

		Iterator<CountryDTO> iterator3 = collection.iterator();
		while (iterator3.hasNext()) {
			CountryDTO country = iterator3.next();
			//countries code is where less than 50 and start with 'A'
			if (country.getCode().ordinal() < 50 && country.getName().startsWith("A")) {
				System.out.println(country.getName() + "- " + country.getCode().getCodeValue());
			}
		}

		Iterator<CountryDTO> iterator4 = collection.iterator();
		while (iterator4.hasNext()) {
			CountryDTO country = iterator4.next();
			// countries is where contains 'I' in the name
			if (country.getName().contains("I")) {
				System.out.println(country.getName());

			}
		}

	}
}