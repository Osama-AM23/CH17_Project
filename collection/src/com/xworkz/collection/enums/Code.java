package com.xworkz.collection.enums;

public enum Code {

	AFG(004), ALB(8), DZA(012), ASM(016), AND(020), AGO(024), AIA(660), ATG(28), ARG(032), ARM(051), ABW(533), AUS(036),
	AUT(040), AZE(031), BHS(044), BHR(48), BGD(050), BRB(052), BLR(112), BEL(056), BLX(58), BLZ(84), BEN(204), BMU(060),
	BTN(064), BOL(68), BIH(070), BWA(072), BAT(80), BRA(076), IOT(86), VGB(92), BRN(96), BGR(100), BFA(854), BDI(108),
	KHM(116), CMR(120), CAN(124), CPV(132), CYM(136), CAF(140), TCD(148), CHL(152), CHN(156), CXR(162), CCK(166),
	COL(170), COM(174), ZAR(180), COG(178), COK(184), CRI(188), CIV(384), HRV(191), CUB(192), CYP(196), CZE(203),
	CSK(200), DNK(208), DJI(262), DMA(212), DOM(214), TMP(626), ECU(218), EGY(818), SLV(222), GNQ(226), ERI(232),
	EST(233), ETH(231), ETF(230), EUN(918), FRO(234), FLK(238), FJI(242), FIN(246), PCZ(592), ZW1(717), TAN(835),
	VDR(868), SVR(866), ZPM(836), ATF(260), FRA(250), FRE(838), GUF(254), PYF(258), GAB(266), GMB(270), GAZ(274),
	GEO(268), DDR(278), DEU(276), GHA(288), GIB(292), GRC(300), GRL(304), GRD(308), GLP(312), GUM(316), GTM(320),
	GIN(324), GNB(624), GUY(328), HTI(332), VAT(336), HND(340), HKG(344), HUN(348), ISL(352), IND(356), IDN(360),
	IRN(364), IRQ(368), IRL(372), ISR(376), ITA(380), JAM(388), JPN(392), JTN(396), JOR(400), KAZ(398), KEN(404),
	KIR(296), PRK(408), KOR(410), KWT(414), KGZ(417), LAO(418), LVA(428), LBN(422), LSO(426), LBR(430), LBY(434),
	LIE(438), LTU(440), LUX(442), MAC(446), MKD(807), MDG(450), MWI(454), MYS(458), MDV(462), MLI(466), MLT(470),
	MHL(584), MTQ(474), MRT(478), MUS(480), MEX(484), FSM(583), MID(488), MDA(498), MCO(492), MNG(496), MSR(500),
	MAR(504), MOZ(508), MMR(104), NAM(516), NRU(520), NPL(524), NLD(528), ANT(530), NZE(536), NCL(540), NZL(554),
	NIC(558), NER(562), NGA(566), NIU(570), NFK(574), MNP(580), NOR(578), OMN(512), PCE(582), PAK(586), PLW(585),
	PAN(591), PNG(598), PRY(600), PMY(459), PER(604), PHL(608), PCN(612), POL(616), PRT(620), PRI(630), QAT(634),
	REU(638), ROM(642), RUS(643), RWA(646), RYU(647), SBH(461), SHN(654), KN1(658), SPM(666), WSM(882), SMR(674),
	STP(678), SWK(457), SAU(682), SEN(686), SYC(690), SLE(694), SIK(698), SGP(702), SVK(703), SVN(705), SLB(90),
	SOM(706), ZAF(710), SVU(810), ESP(724), SPE(839), LKA(144), KNA(659), LCA(662), VCT(670), SDN(736), SUR(740),
	SJM(744), SWZ(748), SWE(752), CHE(756), SYR(760), TWN(158), TJK(762), TZA(834), THA(764), TGO(768), TKL(772),
	TON(776), TTO(780), TUN(788), TUR(792), TKM(795), TCA(796), TUV(798), UGA(800), UKR(804), ARE(784), GBR(826),
	USA(840), UNS(898), URY(858), USP(849), UZB(860), VUT(548), VEN(862), VNM(704), VIR(850), WAK(872), WLF(876),
	ESH(732), WLD(000), YDR(720), YEM(887), SER(891), YUG(890), ZMB(894), ZWE(716);

	private int codeValue;

	Code(int codeValue) {

		this.codeValue = codeValue;

	}

	public int getCodeValue() {
		return codeValue;
	}

}