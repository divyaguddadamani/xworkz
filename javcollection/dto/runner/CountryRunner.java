package com.java.javcollection.dto.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.java.javcollection.dto.CountryDto;
import com.java.javcollection.dto.constants.Code;
import com.java.javcollection.dto.constants.Continent;

public class CountryRunner {
	public static void main(String[] args) {
		
		Collection<CountryDto> collection=new LinkedList<CountryDto>();
		
		CountryDto<String, Integer, String> country1 = new CountryDto<>("Afghanistan", Code.AFGHANISTAN, 39835428, "Mohammad Ashraf Ghani", Continent.ASIA);
		CountryDto<String, Integer, String> country2 = new CountryDto<>("Albania", Code.ALBANIA, 2877797, "Edi Rama", Continent.EUROPE);
		CountryDto<String, Integer, String> country3 = new CountryDto<>("Algeria", Code.ALGERIA, 43851044, "Abdelmadjid Tebboune", Continent.AFRICA);
		CountryDto<String, Integer, String> country4 = new CountryDto<>("Andorra", Code.ANDORRA, 77265, "Xavier Espot Zamora", Continent.EUROPE);
		CountryDto<String, Integer, String> country5 = new CountryDto<>("Angola", Code.ANGOLA, 32866272, "João Lourenço", Continent.AFRICA);
		CountryDto<String, Integer, String> country6 = new CountryDto<>("Antigua and Barbuda", Code.ANTIGUA_AND_BARBUDA, 97928, "Gaston Browne", Continent.AMERICA);
		CountryDto<String, Integer, String> country7 = new CountryDto<>("Argentina", Code.ARGENTINA, 45195777, "Javier Milei", Continent.AMERICA);
		CountryDto<String, Integer, String> country8 = new CountryDto<>("Armenia", Code.ARMENIA, 2963243, "Nikol Pashinyan", Continent.ASIA);
		CountryDto<String, Integer, String> country9 = new CountryDto<>("Australia", Code.AUSTRALIA, 25687041, "Anthony Albanese", Continent.OCEANIA);
		CountryDto<String, Integer, String> country10 = new CountryDto<>("Austria", Code.AUSTRIA, 8917205, "Karl Nehammer", Continent.EUROPE);
		CountryDto<String, Integer, String> country11 = new CountryDto<>("Azerbaijan", Code.AZERBAIJAN, 10139177, "Ilham Aliyev", Continent.ASIA);
		CountryDto<String, Integer, String> country12 = new CountryDto<>("Bahamas", Code.BAHAMAS, 393248, "Perry Christie", Continent.AMERICA);
		CountryDto<String, Integer, String> country13 = new CountryDto<>("Bahrain", Code.BAHRAIN, 1701575, "Hamad bin Isa Al Khalifa", Continent.ASIA);
		CountryDto<String, Integer, String> country14 = new CountryDto<>("Bangladesh", Code.BANGLADESH, 166303498, "Sheikh Hasina", Continent.ASIA);
		CountryDto<String, Integer, String> country15 = new CountryDto<>("Barbados", Code.BARBADOS, 287375, "Mia Mottley", Continent.AMERICA);
		CountryDto<String, Integer, String> country16 = new CountryDto<>("Belarus", Code.BELARUS, 9449323, "Alexander Lukashenko", Continent.EUROPE);
		CountryDto<String, Integer, String> country17 = new CountryDto<>("Belgium", Code.BELGIUM, 11589623, "Alexander De Croo", Continent.EUROPE);
		CountryDto<String, Integer, String> country18 = new CountryDto<>("Belize", Code.BELIZE, 397621, "John Briceño", Continent.AMERICA);
		CountryDto<String, Integer, String> country19 = new CountryDto<>("Benin", Code.BENIN, 12123200, "Patrice Talon", Continent.AFRICA);
		CountryDto<String, Integer, String> country20 = new CountryDto<>("Bhutan", Code.BHUTAN, 763300, "Lotay Tshering", Continent.ASIA);
		CountryDto<String, Integer, String> country21 = new CountryDto<>("Bolivia", Code.BOLIVIA, 11673021, "Luis Arce", Continent.AMERICA);
		CountryDto<String, Integer, String> country22 = new CountryDto<>("Bosnia and Herzegovina", Code.BOSNIA_AND_HERZEGOVINA, 3280819, "Željko Komšić", Continent.EUROPE);
		CountryDto<String, Integer, String> country23 = new CountryDto<>("Botswana", Code.BOTSWANA, 2141206, "Mokgweetsi Masisi", Continent.AFRICA);
		CountryDto<String, Integer, String> country24 = new CountryDto<>("Brazil", Code.BRAZIL, 213993437, "Luiz Inácio Lula da Silva", Continent.AMERICA);
		CountryDto<String, Integer, String> country25 = new CountryDto<>("Brunei", Code.BRUNEI, 453200, "Hassanal Bolkiah", Continent.ASIA);
		CountryDto<String, Integer, String> country26 = new CountryDto<>("Bulgaria", Code.BULGARIA, 6951482, "Kiril Petkov", Continent.EUROPE);
		CountryDto<String, Integer, String> country27 = new CountryDto<>("Burkina Faso", Code.BURKINA_FASO, 22257348, "Ibrahim Traoré", Continent.AFRICA);
		CountryDto<String, Integer, String> country28 = new CountryDto<>("Burundi", Code.BURUNDI, 12013484, "Évariste Ndayishimiye", Continent.AFRICA);
		CountryDto<String, Integer, String> country29 = new CountryDto<>("Cabo Verde", Code.CABO_VERDE, 54991, "José Maria Neves", Continent.AFRICA);
		CountryDto<String, Integer, String> country30 = new CountryDto<>("Cambodia", Code.CAMBODIA, 16718971, "Hun Manet", Continent.ASIA);
		CountryDto<String, Integer, String> country31 = new CountryDto<>("Cameroon", Code.CAMEROON, 27717605, "Paul Biya", Continent.AFRICA);
		CountryDto<String, Integer, String> country32 = new CountryDto<>("Canada", Code.CANADA, 38005238, "Justin Trudeau", Continent.AMERICA);
		CountryDto<String, Integer, String> country33 = new CountryDto<>("Central African Republic", Code.CENTRAL_AFRICAN_REPUBLIC, 5496068, "Faustin-Archange Touadéra", Continent.AFRICA);
		CountryDto<String, Integer, String> country34 = new CountryDto<>("Chad", Code.CHAD, 18664159, "Mahamat Idriss Déby", Continent.AFRICA);
		CountryDto<String, Integer, String> country35 = new CountryDto<>("Chile", Code.CHILE, 19229682, "Gabriel Boric", Continent.AMERICA);
		CountryDto<String, Integer, String> country36 = new CountryDto<>("China", Code.CHINA, 1411778724, "Xi Jinping", Continent.ASIA);
		CountryDto<String, Integer, String> country37 = new CountryDto<>("Colombia", Code.COLOMBIA, 51174696, "Gustavo Petro", Continent.AMERICA);
		CountryDto<String, Integer, String> country38 = new CountryDto<>("Comoros", Code.COMOROS, 806153, "Azali Assoumani", Continent.AFRICA);
		CountryDto<String, Integer, String> country39 = new CountryDto<>("Congo (Brazzaville)", Code.CONGO_BRAZZAVILLE, 4741000, "Denis Sassou Nguesso", Continent.AFRICA);
		CountryDto<String, Integer, String> country40 = new CountryDto<>("Congo (Kinshasa)", Code.CONGO_KINSHASA, 10118091, "Félix Tshisekedi", Continent.AFRICA);
		CountryDto<String, Integer, String> country41 = new CountryDto<>("Costa Rica", Code.COSTA_RICA, 5099700, "Gina Rodríguez", Continent.AMERICA);
		CountryDto<String, Integer, String> country42 = new CountryDto<>("Croatia", Code.CROATIA, 4105267, "Andrej Plenković", Continent.EUROPE);
		CountryDto<String, Integer, String> country43 = new CountryDto<>("Cuba", Code.CUBA, 11313450, "Miguel Díaz-Canel", Continent.AMERICA);
		CountryDto<String, Integer, String> country44 = new CountryDto<>("Cyprus", Code.CYPRUS, 1207359, "Katsianis Rikkos", Continent.EUROPE);
		CountryDto<String, Integer, String> country45 = new CountryDto<>("Czech Republic", Code.CZECH_REPUBLIC, 10708981, "Petr Fiala", Continent.EUROPE);
		CountryDto<String, Integer, String> country46 = new CountryDto<>("Denmark", Code.DENMARK, 5818553, "Mette Frederiksen", Continent.EUROPE);
		CountryDto<String, Integer, String> country47 = new CountryDto<>("Djibouti", Code.DJIBOUTI, 883568, "Ismail Omar Guelleh", Continent.AFRICA);
		CountryDto<String, Integer, String> country48 = new CountryDto<>("Dominica", Code.DOMINICA, 71986, "Roosevelt Skerrit", Continent.AMERICA);
		CountryDto<String, Integer, String> country49 = new CountryDto<>("Dominican Republic", Code.DOMINICAN_REPUBLIC, 10847904, "Luis Abinader", Continent.AMERICA);
		CountryDto<String, Integer, String> country50 = new CountryDto<>("Ecuador", Code.ECUADOR, 17840153, "Guillermo Lasso", Continent.AMERICA);
		CountryDto<String, Integer, String> country51 = new CountryDto<>("Egypt", Code.EGYPT, 10412444, "Abdel Fattah el-Sisi", Continent.AFRICA);
		CountryDto<String, Integer, String> country52 = new CountryDto<>("El Salvador", Code.EL_SALVADOR, 6486201, "Gustavo López", Continent.AMERICA);
		CountryDto<String, Integer, String> country53 = new CountryDto<>("Equatorial Guinea", Code.EQUATORIAL_GUINEA, 1402985, "Teodoro Obiang Nguema Mbasogo", Continent.AFRICA);
		CountryDto<String, Integer, String> country54 = new CountryDto<>("Eritrea", Code.ERITREA, 3546000, "Isaias Afwerki", Continent.AFRICA);
		CountryDto<String, Integer, String> country55 = new CountryDto<>("Estonia", Code.ESTONIA, 1326535, "Kaja Kallas", Continent.EUROPE);
		CountryDto<String, Integer, String> country56 = new CountryDto<>("Eswatini", Code.ESWATINI, 1180164, "Cecil Monana", Continent.AFRICA);
		CountryDto<String, Integer, String> country57 = new CountryDto<>("Ethiopia", Code.ETHIOPIA, 126175138, "Abiy Ahmed", Continent.AFRICA);
		CountryDto<String, Integer, String> country58 = new CountryDto<>("Fiji", Code.FIJI, 896444, "Sitiveni Rabuka", Continent.OCEANIA);
		CountryDto<String, Integer, String> country59 = new CountryDto<>("Finland", Code.FINLAND, 5540720, "Petteri Orpo", Continent.EUROPE);
		CountryDto<String, Integer, String> country60 = new CountryDto<>("France", Code.FRANCE, 65273511, "Emmanuel Macron", Continent.EUROPE);
		CountryDto<String, Integer, String> country61 = new CountryDto<>("Gabon", Code.GABON, 2260498, "Ali Bongo Ondimba", Continent.AFRICA);
		CountryDto<String, Integer, String> country62 = new CountryDto<>("Gambia", Code.GAMBIA, 2416661, "Adama Barrow", Continent.AFRICA);
		CountryDto<String, Integer, String> country63 = new CountryDto<>("Georgia", Code.GEORGIA, 3989167, "Irakli Garibashvili", Continent.ASIA);
		CountryDto<String, Integer, String> country64 = new CountryDto<>("Germany", Code.GERMANY, 83783942, "Olaf Scholz", Continent.EUROPE);
		CountryDto<String, Integer, String> country65 = new CountryDto<>("Ghana", Code.GHANA, 31072940, "Nana Akufo-Addo", Continent.AFRICA);
		CountryDto<String, Integer, String> country66 = new CountryDto<>("Greece", Code.GREECE, 10423054, "Kyriakos Mitsotakis", Continent.EUROPE);
		CountryDto<String, Integer, String> country67 = new CountryDto<>("Grenada", Code.GRENADA, 112519, "Dickon Mitchell", Continent.AMERICA);
		CountryDto<String, Integer, String> country68 = new CountryDto<>("Guatemala", Code.GUATEMALA, 17915568, "Bernardo Arévalo", Continent.AMERICA);
		CountryDto<String, Integer, String> country69 = new CountryDto<>("Guinea", Code.GUINEA, 13132795, "Mamady Doumbouya", Continent.AFRICA);
		CountryDto<String, Integer, String> country70 = new CountryDto<>("Guinea-Bissau", Code.GUINEA_BISSAU, 2068987, "Umaro Sissoco Embaló", Continent.AFRICA);
		CountryDto<String, Integer, String> country71 = new CountryDto<>("Guyana", Code.GUYANA, 790326, "Irfaan Ali", Continent.AMERICA);
		CountryDto<String, Integer, String> country72 = new CountryDto<>("Haiti", Code.HAITI, 11402548, "Ariel Henry", Continent.AMERICA);
		CountryDto<String, Integer, String> country73 = new CountryDto<>("Honduras", Code.HONDURAS, 9904607, "Xiomara Castro", Continent.AMERICA);
		CountryDto<String, Integer, String> country74 = new CountryDto<>("Hungary", Code.HUNGARY, 9660351, "Viktor Orbán", Continent.EUROPE);
		CountryDto<String, Integer, String> country75 = new CountryDto<>("Iceland", Code.ICELAND, 343599, "Jakob Frímann Magnússon", Continent.EUROPE);
		CountryDto<String, Integer, String> country76 = new CountryDto<>("India", Code.INDIA, 1393409038, "Narendra Modi", Continent.ASIA);
		CountryDto<String, Integer, String> country77 = new CountryDto<>("Indonesia", Code.INDONESIA, 276361783, "Joko Widodo", Continent.ASIA);
		CountryDto<String, Integer, String> country78 = new CountryDto<>("Iran", Code.IRAN, 86959306, "Ebrahim Raisi", Continent.ASIA);
		CountryDto<String, Integer, String> country79 = new CountryDto<>("Iraq", Code.IRAQ, 42274910, "Mohammed Shia' Al-Sudani", Continent.ASIA);
		CountryDto<String, Integer, String> country80 = new CountryDto<>("Ireland", Code.IRELAND, 4937786, "Leo Varadkar", Continent.EUROPE);
		CountryDto<String, Integer, String> country81 = new CountryDto<>("Israel", Code.ISRAEL, 9200000, "Isaac Herzog", Continent.ASIA);
		CountryDto<String, Integer, String> country82 = new CountryDto<>("Italy", Code.ITALY, 60244639, "Giorgia Meloni", Continent.EUROPE);
		CountryDto<String, Integer, String> country83 = new CountryDto<>("Jamaica", Code.JAMAICA, 2961163, "Andrew Holness", Continent.AMERICA);
		CountryDto<String, Integer, String> country84 = new CountryDto<>("Japan", Code.JAPAN, 126476461, "Fumio Kishida", Continent.ASIA);
		CountryDto<String, Integer, String> country85 = new CountryDto<>("Jordan", Code.JORDAN, 10203134, "Bashar al-Assad", Continent.ASIA);
		CountryDto<String, Integer, String> country86 = new CountryDto<>("Kazakhstan", Code.KAZAKHSTAN, 18776707, "Kassym-Jomart Tokayev", Continent.ASIA);
		CountryDto<String, Integer, String> country87 = new CountryDto<>("Kenya", Code.KENYA, 53771296, "William Ruto", Continent.AFRICA);
		CountryDto<String, Integer, String> country88 = new CountryDto<>("Kiribati", Code.KIRIBATI, 119446, "Teburoro Tito", Continent.OCEANIA);
		CountryDto<String, Integer, String> country89 = new CountryDto<>("Kuwait", Code.KUWAIT, 4420117, "Sabah Al-Ahmad Al-Jaber Al-Sabah", Continent.ASIA);
		CountryDto<String, Integer, String> country90 = new CountryDto<>("Kyrgyzstan", Code.KYRGYZSTAN, 6524195, "Sadyr Japarov", Continent.ASIA);
		CountryDto<String, Integer, String> country91 = new CountryDto<>("Laos", Code.LAOS, 7485000, "Sonexay Siphandone", Continent.ASIA);
		CountryDto<String, Integer, String> country92 = new CountryDto<>("Latvia", Code.LATVIA, 1886198, "Edgars Rinkēvičs", Continent.EUROPE);
		CountryDto<String, Integer, String> country93 = new CountryDto<>("Lebanon", Code.LEBANON, 6825445, "Nabih Berri", Continent.ASIA);
		CountryDto<String, Integer, String> country94 = new CountryDto<>("Lesotho", Code.LESOTHO, 2328000, "Moeketsi Majoro", Continent.AFRICA);
		CountryDto<String, Integer, String> country95 = new CountryDto<>("Liberia", Code.LIBERIA, 5057681, "George Weah", Continent.AFRICA);
		CountryDto<String, Integer, String> country96 = new CountryDto<>("Libya", Code.LIBYA, 6871292, "Abdul Hamid Dbeibeh", Continent.AFRICA);
		CountryDto<String, Integer, String> country97 = new CountryDto<>("Liechtenstein", Code.LIECHTENSTEIN, 38128, "Daniel Risch", Continent.EUROPE);
		CountryDto<String, Integer, String> country98 = new CountryDto<>("Lithuania", Code.LITHUANIA, 2722289, "Gitanas Nausėda", Continent.EUROPE);
		CountryDto<String, Integer, String> country99 = new CountryDto<>("Luxembourg", Code.LUXEMBOURG, 634814, "Xavier Bettel", Continent.EUROPE);
		CountryDto<String, Integer, String> country100 = new CountryDto<>("Madagascar", Code.MADAGASCAR, 27691018, "Andry Rajoelina", Continent.AFRICA);
		CountryDto<String, Integer, String> country101 = new CountryDto<>("Malawi", Code.MALAWI, 19662760, "Lazarus Chakwera", Continent.AFRICA);
		CountryDto<String, Integer, String> country102 = new CountryDto<>("Malaysia", Code.MALAYSIA, 32365998, "Anwar Ibrahim", Continent.ASIA);
		CountryDto<String, Integer, String> country103 = new CountryDto<>("Maldives", Code.MALDIVES, 515696, "Mohamed Muizzu", Continent.ASIA);
		CountryDto<String, Integer, String> country104 = new CountryDto<>("Mali", Code.MALI, 20250833, "Assimi Goïta", Continent.AFRICA);
		CountryDto<String, Integer, String> country105 = new CountryDto<>("Malta", Code.MALTA, 514999, "Robert Abela", Continent.EUROPE);
		CountryDto<String, Integer, String> country106 = new CountryDto<>("Marshall Islands", Code.MARSHALL_ISLANDS, 59194, "David Kabua", Continent.OCEANIA);
		CountryDto<String, Integer, String> country107 = new CountryDto<>("Mauritania", Code.MAURITANIA, 4649658, "Mohamed Ould Ghazouani", Continent.AFRICA);
		CountryDto<String, Integer, String> country108 = new CountryDto<>("Mauritius", Code.MAURITIUS, 1271768, "Pravind Jugnauth", Continent.AFRICA);
		CountryDto<String, Integer, String> country109 = new CountryDto<>("Mexico", Code.MEXICO, 126190788, "Andrés Manuel López Obrador", Continent.AMERICA);
		CountryDto<String, Integer, String> country110 = new CountryDto<>("Micronesia", Code.MICRONESIA, 104347, "David Panuelo", Continent.OCEANIA);
		CountryDto<String, Integer, String> country111 = new CountryDto<>("Moldova", Code.MOLDOVA, 2657637, "Igor Dodon", Continent.EUROPE);
		CountryDto<String, Integer, String> country112 = new CountryDto<>("Monaco", Code.MONACO, 39242, "Boris Sarac", Continent.EUROPE);
		CountryDto<String, Integer, String> country113 = new CountryDto<>("Mongolia", Code.MONGOLIA, 3284916, "Ukhnaagiin Khürelsükh", Continent.ASIA);
		CountryDto<String, Integer, String> country114 = new CountryDto<>("Montenegro", Code.MONTENEGRO, 622359, "Dritan Abazović", Continent.EUROPE);
		CountryDto<String, Integer, String> country115 = new CountryDto<>("Morocco", Code.MOROCCO, 36910560, "Aziz Akhannouch", Continent.AFRICA);
		CountryDto<String, Integer, String> country116 = new CountryDto<>("Mozambique", Code.MOZAMBIQUE, 31255435, "Filipe Nyusi", Continent.AFRICA);
		CountryDto<String, Integer, String> country117 = new CountryDto<>("Myanmar", Code.MYANMAR, 54409800, "Min Aung Hlaing", Continent.ASIA);
		CountryDto<String, Integer, String> country118 = new CountryDto<>("Namibia", Code.NAMIBIA, 2540905, "Hage Geingob", Continent.AFRICA);
		CountryDto<String, Integer, String> country119 = new CountryDto<>("Nauru", Code.NAURU, 10834, "David Adeang", Continent.OCEANIA);
		CountryDto<String, Integer, String> country120 = new CountryDto<>("Nepal", Code.NEPAL, 29136808, "Pushpa Kamal Dahal", Continent.ASIA);
		CountryDto<String, Integer, String> country121 = new CountryDto<>("Netherlands", Code.NETHERLANDS, 17134872, "Mark Rutte", Continent.EUROPE);
		CountryDto<String, Integer, String> country122 = new CountryDto<>("New Zealand", Code.NEW_ZEALAND, 5080000, "Chris Hipkins", Continent.OCEANIA);
		CountryDto<String, Integer, String> country123 = new CountryDto<>("Nicaragua", Code.NICARAGUA, 6624554, "Daniel Ortega", Continent.AMERICA);
		CountryDto<String, Integer, String> country124 = new CountryDto<>("Niger", Code.NIGER, 24206644, "Mohamed Bazoum", Continent.AFRICA);
		CountryDto<String, Integer, String> country125 = new CountryDto<>("Nigeria", Code.NIGERIA, 211400708, "Bola Ahmed Tinubu", Continent.AFRICA);
		CountryDto<String, Integer, String> country126 = new CountryDto<>("North Korea", Code.NORTH_KOREA, 25778816, "Kim Jong-un", Continent.ASIA);
		CountryDto<String, Integer, String> country127 = new CountryDto<>("North Macedonia", Code.NORTH_MACEDONIA, 2083459, "Dimitar Kovačevski", Continent.EUROPE);
		CountryDto<String, Integer, String> country128 = new CountryDto<>("Norway", Code.NORWAY, 5421241, "Jonas Gahr Støre", Continent.EUROPE);
		CountryDto<String, Integer, String> country129 = new CountryDto<>("Oman", Code.OMAN, 5106622, "Haitham bin Tariq", Continent.ASIA);
		CountryDto<String, Integer, String> country130 = new CountryDto<>("Pakistan", Code.PAKISTAN, 240485658, "Anwar-ul-Haq Kakar", Continent.ASIA);
		CountryDto<String, Integer, String> country131 = new CountryDto<>("Palau", Code.PALAU, 18000, "Surangel Whipps", Continent.OCEANIA);
		CountryDto<String, Integer, String> country132 = new CountryDto<>("Panama", Code.PANAMA, 4314768, "Martinelli", Continent.AMERICA);
		CountryDto<String, Integer, String> country133 = new CountryDto<>("Papua New Guinea", Code.PAPUA_NEW_GUINEA, 9132576, "James Marape", Continent.OCEANIA);
		CountryDto<String, Integer, String> country134 = new CountryDto<>("Paraguay", Code.PARAGUAY, 7132532, "Santiago Peña", Continent.AMERICA);
		CountryDto<String, Integer, String> country135 = new CountryDto<>("Peru", Code.PERU, 33193525, "Dina Boluarte", Continent.AMERICA);
		CountryDto<String, Integer, String> country136 = new CountryDto<>("Philippines", Code.PHILIPPINES, 113880000, "Ferdinand Marcos Jr.", Continent.ASIA);
		CountryDto<String, Integer, String> country137 = new CountryDto<>("Poland", Code.POLAND, 38386000, "Mateusz Morawiecki", Continent.EUROPE);
		CountryDto<String, Integer, String> country138 = new CountryDto<>("Portugal", Code.PORTUGAL, 10196709, "Marcelo Rebelo de Sousa", Continent.EUROPE);
		CountryDto<String, Integer, String> country139 = new CountryDto<>("Qatar", Code.QATAR, 2781677, "Tamim bin Hamad Al Thani", Continent.ASIA);
		CountryDto<String, Integer, String> country140 = new CountryDto<>("Romania", Code.ROMANIA, 19237691, "Marcel Ciolacu", Continent.EUROPE);
		CountryDto<String, Integer, String> country141 = new CountryDto<>("Russia", Code.RUSSIA, 145912025, "Vladimir Putin", Continent.EUROPE);
		CountryDto<String, Integer, String> country142 = new CountryDto<>("Rwanda", Code.RWANDA, 13142756, "Paul Kagame", Continent.AFRICA);
		CountryDto<String, Integer, String> country143 = new CountryDto<>("Saint Kitts and Nevis", Code.SAINT_KITTS_AND_NEVIS, 53000, "Terrance Drew", Continent.AMERICA);
		CountryDto<String, Integer, String> country144 = new CountryDto<>("Saint Lucia", Code.SAINT_LUCIA, 183627, "Piazzi Knight", Continent.AMERICA);
		CountryDto<String, Integer, String> country145 = new CountryDto<>("Saint Vincent and the Grenadines", Code.SAINT_VINCENT_AND_THE_GRENADINES, 110000, "Ralph Gonsalves", Continent.AMERICA);
		CountryDto<String, Integer, String> country146 = new CountryDto<>("Samoa", Code.SAMOA, 198410, "Fiame Naomi Mataʻafa", Continent.OCEANIA);
		CountryDto<String, Integer, String> country147 = new CountryDto<>("San Marino", Code.SAN_MARINO, 33931, "Giorgio Jannini", Continent.EUROPE);
		CountryDto<String, Integer, String> country148 = new CountryDto<>("Saudi Arabia", Code.SAUDI_ARABIA, 35659900, "Mohammed bin Salman", Continent.ASIA);
		CountryDto<String, Integer, String> country149 = new CountryDto<>("Senegal", Code.SENEGAL, 16620000, "Macky Sall", Continent.AFRICA);
		CountryDto<String, Integer, String> country150 = new CountryDto<>("Serbia", Code.SERBIA, 8772235, "Aleksandar Vučić", Continent.EUROPE);
		CountryDto<String, Integer, String> country151 = new CountryDto<>("Seychelles", Code.SEYCHELLES, 98347, "Wavel Ramkalawan", Continent.AFRICA);
		CountryDto<String, Integer, String> country152 = new CountryDto<>("Singapore", Code.SINGAPORE, 5633000, "Heng Swee Keat", Continent.ASIA);
		CountryDto<String, Integer, String> country153 = new CountryDto<>("Slovakia", Code.SLOVAKIA, 5456362, "Robert Fico", Continent.EUROPE);
		CountryDto<String, Integer, String> country154 = new CountryDto<>("Slovenia", Code.SLOVENIA, 2078654, "Robert Golob", Continent.EUROPE);
		CountryDto<String, Integer, String> country155 = new CountryDto<>("Solomon Islands", Code.SOLOMON_ISLANDS, 686878, "Manasseh Sogavare", Continent.OCEANIA);
		CountryDto<String, Integer, String> country156 = new CountryDto<>("Somalia", Code.SOMALIA, 15433940, "Hassan Sheikh Mohamud", Continent.AFRICA);
		CountryDto<String, Integer, String> country157 = new CountryDto<>("South Africa", Code.SOUTH_AFRICA, 59308690, "Cyril Ramaphosa", Continent.AFRICA);
		CountryDto<String, Integer, String> country158 = new CountryDto<>("South Korea", Code.SOUTH_KOREA, 51269185, "Yoon Suk-yeol", Continent.ASIA);
		CountryDto<String, Integer, String> country159 = new CountryDto<>("South Sudan", Code.SOUTH_SUDAN, 10997548, "Salva Kiir Mayardit", Continent.AFRICA);
		CountryDto<String, Integer, String> country160 = new CountryDto<>("Spain", Code.SPAIN, 46754778, "Pedro Sánchez", Continent.EUROPE);
		CountryDto<String, Integer, String> country161 = new CountryDto<>("Sri Lanka", Code.SRI_LANKA, 21513990, "Ranil Wickremesinghe", Continent.ASIA);
		CountryDto<String, Integer, String> country162 = new CountryDto<>("Sudan", Code.SUDAN, 46700000, "Abdel Fattah al-Burhan", Continent.AFRICA);
		CountryDto<String, Integer, String> country163 = new CountryDto<>("Suriname", Code.SURINAME, 581363, "Chandrikapersad Santokhi", Continent.AMERICA);
		CountryDto<String, Integer, String> country164 = new CountryDto<>("Sweden", Code.SWEDEN, 10379295, "Ulf Kristersson", Continent.EUROPE);
		CountryDto<String, Integer, String> country165 = new CountryDto<>("Switzerland", Code.SWITZERLAND, 8654622, "Alain Berset", Continent.EUROPE);
		CountryDto<String, Integer, String> country166 = new CountryDto<>("Syria", Code.SYRIA, 18892300, "Bashar al-Assad", Continent.ASIA);
		CountryDto<String, Integer, String> country167 = new CountryDto<>("Taiwan", Code.TAIWAN, 23816775, "Lai Ching-te", Continent.ASIA);
		CountryDto<String, Integer, String> country168 = new CountryDto<>("Tajikistan", Code.TAJIKISTAN, 9494000, "Emomali Rahmon", Continent.ASIA);
		CountryDto<String, Integer, String> country169 = new CountryDto<>("Tanzania", Code.TANZANIA, 61500000, "Samia Suluhu Hassan", Continent.AFRICA);
		CountryDto<String, Integer, String> country170 = new CountryDto<>("Thailand", Code.THAILAND, 69950801, "Prayuth Chan-o-cha", Continent.ASIA);
		CountryDto<String, Integer, String> country171 = new CountryDto<>("Timor-Leste", Code.TIMOR_LESTE, 1318445, "Xanana Gusmão", Continent.ASIA);
		CountryDto<String, Integer, String> country172 = new CountryDto<>("Togo", Code.TOGO, 8278724, "Faure Gnassingbé", Continent.AFRICA);
		CountryDto<String, Integer, String> country173 = new CountryDto<>("Tonga", Code.TONGA, 105696, "Siaosi Sovaleni", Continent.OCEANIA);
		CountryDto<String, Integer, String> country174 = new CountryDto<>("Trinidad and Tobago", Code.TRINIDAD_AND_TOBAGO, 1399488, "Paula-Mae Weekes", Continent.AMERICA);
		CountryDto<String, Integer, String> country175 = new CountryDto<>("Tunisia", Code.TUNISIA, 11818619, "Kais Saied", Continent.AFRICA);
		CountryDto<String, Integer, String> country176 = new CountryDto<>("Turkey", Code.TURKEY, 85900000, "Recep Tayyip Erdoğan", Continent.ASIA);
		CountryDto<String, Integer, String> country177 = new CountryDto<>("Turkmenistan", Code.TURKMENISTAN, 6031200, "Serdar Berdimuhamedow", Continent.ASIA);
		CountryDto<String, Integer, String> country178 = new CountryDto<>("Tuvalu", Code.TUVALU, 11946, "Kausea Natano", Continent.OCEANIA);
		CountryDto<String, Integer, String> country179 = new CountryDto<>("Uganda", Code.UGANDA, 48240000, "Yoweri Museveni", Continent.AFRICA);
		CountryDto<String, Integer, String> country180 = new CountryDto<>("Ukraine", Code.UKRAINE, 43733762, "Volodymyr Zelenskyy", Continent.EUROPE);
		CountryDto<String, Integer, String> country181 = new CountryDto<>("United Arab Emirates", Code.UNITED_ARAB_EMIRATES, 9890400, "Mohammed bin Zayed Al Nahyan", Continent.ASIA);
		CountryDto<String, Integer, String> country182 = new CountryDto<>("United Kingdom", Code.UNITED_KINGDOM, 67886011, "Rishi Sunak", Continent.EUROPE);
		CountryDto<String, Integer, String> country183 = new CountryDto<>("United States", Code.UNITED_STATES, 331002651, "Joe Biden", Continent.AMERICA);
		CountryDto<String, Integer, String> country184 = new CountryDto<>("Uruguay", Code.URUGUAY, 3473730, "Luis Lacalle Pou", Continent.AMERICA);
		CountryDto<String, Integer, String> country185 = new CountryDto<>("Uzbekistan", Code.UZBEKISTAN, 33468900, "Shavkat Mirziyoyev", Continent.ASIA);
		CountryDto<String, Integer, String> country186 = new CountryDto<>("Vanuatu", Code.VANUATU, 307150, "Ishmael Kalsakau", Continent.OCEANIA);
		CountryDto<String, Integer, String> country187 = new CountryDto<>("Vatican City", Code.VATICAN_CITY, 800, "Pope Francis", Continent.EUROPE);
		CountryDto<String, Integer, String> country188 = new CountryDto<>("Venezuela", Code.VENEZUELA, 28435943, "Nicolás Maduro", Continent.AMERICA);
		CountryDto<String, Integer, String> country189 = new CountryDto<>("Vietnam", Code.VIETNAM, 98168829, "Phạm Minh Chính", Continent.ASIA);
		CountryDto<String, Integer, String> country190 = new CountryDto<>("Yemen", Code.YEMEN, 29825968, "Mansour Hadi", Continent.AFRICA);
		CountryDto<String, Integer, String> country191 = new CountryDto<>("Zambia", Code.ZAMBIA, 18927700, "Hakainde Hichilema", Continent.AFRICA);
		CountryDto<String, Integer, String> country192 = new CountryDto<>("Zimbabwe", Code.ZIMBABWE, 14862027, "Emmerson Mnangagwa", Continent.AFRICA);
          
		
	    	collection.add(country1);
	    	collection.add(country2);
	    	collection.add(country3);
	    	collection.add(country4);
	        collection.add(country5);
	        collection.add(country6);
	        collection.add(country7);
	        collection.add(country8);
	        collection.add(country9);
	        collection.add(country10);
	        collection.add(country11);
	        collection.add(country12);
	        collection.add(country13);
	        collection.add(country14);
	        collection.add(country15);
	        collection.add(country16);
	        collection.add(country17);
	        collection.add(country18);
	        collection.add(country19);
	        collection.add(country20);
	        collection.add(country21);
	        collection.add(country22);
	        collection.add(country23);
	        collection.add(country24);
	        collection.add(country25);
	        collection.add(country26);
	        collection.add(country27);
	        collection.add(country28);
	        collection.add(country29);
	        collection.add(country30);
	        collection.add(country31);
	        collection.add(country32);
	        collection.add(country33);
	        collection.add(country34);
	        collection.add(country35);
	        collection.add(country36);
	        collection.add(country37);
	        collection.add(country38);
	        collection.add(country39);
	        collection.add(country40);
	        collection.add(country41);
	        collection.add(country42);
	        collection.add(country43);
	        collection.add(country44);
	        collection.add(country45);
	        collection.add(country46);
	        collection.add(country47);
	        collection.add(country48);
	        collection.add(country49);
	        collection.add(country50);
	        collection.add(country51);
	        collection.add(country52);
	        collection.add(country53);
	        collection.add(country54);
	        collection.add(country55);
	        collection.add(country56);
	        collection.add(country57);
	        collection.add(country58);
	        collection.add(country59);
	        collection.add(country60);
	        collection.add(country61);
	        collection.add(country62);
	        collection.add(country63);
	        collection.add(country64);
	        collection.add(country65);
	        collection.add(country66);
	        collection.add(country67);
	        collection.add(country68);
	        collection.add(country69);
	        collection.add(country70);
	        collection.add(country71);
	        collection.add(country72);
	        collection.add(country73);
	        collection.add(country74);
	        collection.add(country75);
	        collection.add(country76);
	        collection.add(country77);
	        collection.add(country78);
	        collection.add(country79);
	        collection.add(country80);
	        collection.add(country81);
	        collection.add(country82);
	        collection.add(country83);
	        collection.add(country84);
	        collection.add(country85);
	        collection.add(country86);
	        collection.add(country87);
	        collection.add(country88);
	        collection.add(country89);
	        collection.add(country90);
	        collection.add(country91);
	        collection.add(country92);
	        collection.add(country93);
	        collection.add(country94);
	        collection.add(country95);
	        collection.add(country96);
	        collection.add(country97);
	        collection.add(country98);
	        collection.add(country99);
	        collection.add(country100);
	        collection.add(country101);
	        collection.add(country102);
	        collection.add(country103);
	        collection.add(country104);
	        collection.add(country105);
	        collection.add(country106);
	        collection.add(country107);
	        collection.add(country108);
	        collection.add(country109);
	        collection.add(country110);
	        collection.add(country111);
	        collection.add(country112);
	        collection.add(country113);
	        collection.add(country114);
	        collection.add(country115);
	        collection.add(country116);
	        collection.add(country117);
	        collection.add(country118);
	        collection.add(country119);
	        collection.add(country120);
	        collection.add(country121);
	        collection.add(country122);
	        collection.add(country123);
	        collection.add(country124);
	        collection.add(country125);
	        collection.add(country126);
	        collection.add(country127);
	        collection.add(country128);
	        collection.add(country129);
	        collection.add(country130);
	        collection.add(country131);
	        collection.add(country132);
	        collection.add(country133);
	        collection.add(country134);
	        collection.add(country135);
	        collection.add(country136);
	        collection.add(country137);
	        collection.add(country138);
	        collection.add(country139);
	        collection.add(country140);
	        collection.add(country141);
	        collection.add(country142);
	        collection.add(country143);
	        collection.add(country144);
	        collection.add(country145);
	        collection.add(country146);
	        collection.add(country147);
	        collection.add(country148);
	        collection.add(country149);
	        collection.add(country150);
	        collection.add(country151);
	        collection.add(country152);
	        collection.add(country153);
	        collection.add(country154);
	        collection.add(country155);
	        collection.add(country156);
	        collection.add(country157);
	        collection.add(country158);
	        collection.add(country159);
	        collection.add(country160);
	        collection.add(country161);
	        collection.add(country162);
	        collection.add(country163);
	        collection.add(country164);
	        collection.add(country165);
	        collection.add(country166);
	        collection.add(country167);
	        collection.add(country168);
	        collection.add(country169);
	        collection.add(country170);
	        collection.add(country171);
	        collection.add(country172);
	        collection.add(country173);
	        collection.add(country174);
	        collection.add(country175);
	        collection.add(country176);
	        collection.add(country177);
	        collection.add(country178);
	        collection.add(country179);
	        collection.add(country180);
	        collection.add(country181);
	        collection.add(country182);
	        collection.add(country183);
	        collection.add(country184);
	        collection.add(country185);
	        collection.add(country186);
	        collection.add(country187);
	        collection.add(country188);
	    	collection.add(country189);
			collection.add(country190);
			collection.add(country191);
			collection.add(country192);
		
			
			System.out.println("size is:"+collection.size());
		
		
		Iterator<CountryDto> iterator = collection.iterator();
		

		while (iterator.hasNext()) {
			CountryDto ref = iterator.next();
			System.out.println(ref.getName() );
			System.out.println(ref.getPresidentName());
		}
		
		System.out.println("==============================================");


		for (CountryDto<String, Integer,String> country : collection) {
			if (country.getPopulation() > 250000000) {
				System.out.println(country);
			}
		}
		
			Iterator<CountryDto> iterator1 = collection.iterator();
			while (iterator1.hasNext()) {
				CountryDto ref = iterator1.next();
				int code1 = ref.getCode().getCode();
				if (code1 < 50) {
					System.out.println(ref.getName());
				}
			}

	        
			 System.out.println("=======================================================");
			
			 for (CountryDto<String, Integer,String> country : collection)
			 {
				 if(country.getCode().getCode()<50 &&country.getName().startsWith("A"))
				 {
					 System.out.println(country.getName());
				 }
			 }
			 System.out.println("=======================================================");
			 
			 for (CountryDto<String, Integer,String> country : collection)
			 {
				 if(country.getName().contains("i")  ||   country.getName().contains("I") )
				 {
					 System.out.println(country.getName());
				 }
	}

}
}
