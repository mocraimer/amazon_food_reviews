package food_reviews;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class FinderTest {
	Finder finder = new Finder(true);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testgetMostActive() {
		List<String> expectedUserids = (List) Arrays.asList("A3OXHLG6DIBRW8, A1YUL9PCJR3JTY, AY12DBB0U420B, A281NPSIMI1C2R, A1Z54EM24Y40LL, A1TMAVN4CEM8U8, A2MUGFV2TDQ47K, A3TVZM3ZIXG8YW, A3PJZ8TU8FDQ1K, AQQLWCMRNDFGI, A2SZLNSI5KOQJT, A29JUMRL1US6YP, AZV26LP92E6WU, A31N6KB160O508, AY1EF0GOH80EK, A2FRFAQCWZJT3Q, A1UQBFCERIP7VJ, AKMEY1BSHSDG7, A1LZJZIHUPLDV4, A1WX42M589VAMQ, A2Y8IDC1FKGNJC, A3D6OI36USYOU1, A3HPCRD9RX351S, A2PNOU7NXB1JE4, AKZKG2Z7CNV27, A33AQPJYH7UUXR, A35R32TA60XD57, A1IU7S4HCK1XK0, A1X1CEGHTHMBL1, A36WGHR8TO5DKT, A2DPYMNI2HCIOI, AQLL2R1PPR46X, A3FY3H6F4249E0, A1HRYC60VTMYC0, A2GEZJHBV92EVR, ADS5APY1NKTL4, A3FKGKUCI3DG9U, ALSAOZ1V546VT, A3F3B1JPACN215, A1P2XYD265YE21, A2XNOB1T796Y6B, A36MP37DITBU6F, A2R6RA8FRBS608, A3QNQQKJTL76H0, A2M9D9BDHONV3Y, A1ZH9LWMX5UCFJ, A25C2M3QF9G7OQ, A17HMM1M7T9PJ1, A250AXLRBVYKB4, AEC90GPFKLAAW, A2OEUROGZDTXUJ, A1Z4LX3Q1YMF84, A2TN9C5E4A0I3F, A2OWR2PL3DLWS4, A2MNB77YGJ3CN0, AMRMK86X3PKXD, A3RR2P5IS3DGPR, A2E3WMF9RWW2X2, ACYR6O588USK, AYB4ELCS5AM8P, A1GYEGLX3P2Y7P, A2C9XE9I8RSKNX, AJD41FBJD9010, A3OXRFCJI67IMN, A24ZV048V7J0MT, A29313797NGT9L, A3M8R4JD1SIS76, A1YJMG0QJXZLD4, A2TJG4N8LNJW23, A22CW0ZHY3NJH8, A3OGYXV9S7MJHM, A2A1XYSB692L6J, A3094EPI56GKZ6, ARYSDAZNRXN6G, A1Q7A78VSQ5GQ4, A383XURHVF8ON6, A1T1YSCDW0PD25, A2D1LPEUCTNT8X, A3NEAETOSXDBOM, A2G7B7FKP2O2PU, A1K82R24ROO2I7, A3BH49ZKESHDID, A1ODOGXEYECQQ8, A2XNJJ9TF70P4J, AXO4PQU0XG3TG, A1SO1PGDNVMLXC, A29P51TN9KKMU9, A175N19FS2B4J, A2YKWYC3WQJX5J, A2A8KWCE8RKB9T, A2YB7DLC3FOR7W, A3EBHHCZO6V2A4, A1XGFW5016CGQI, A26A64X86VL1R4, AAUICTIUBVU7R, AYOMAHLWRQHUG, A6KL17KKN0A5L, ALDAF4VVLFRHP, ATJN4KEHJBOC8, A2OWR5G2OAQF7C, A35JP8KSV9281K, APP8XWYYV4PAA, A16KK3YHCWE29C, A17V9XL4CWTQ6G, A132ETQPMHQ585, A1PI8VBCXXSGC7, A1RLP0R1N8H8C4, A2II09GQGWOMTQ, A2YIO225BTKVPU, A3VKBFC5K2INR4, A1LFSTBR7L7PUT, A1ZPY91VE3IDN1, A370Z6I5GBWU44, AMQ1MEG334SAP, AR7TAEEUDHMUB, A1080SE9X3ECK0, A13HRSMJ5TOWEZ, A1B05INWIDZ74O, A3MUSWDCTZINQZ, A16WPA6JV83YXT, A19123D9G66E0O, A1KEK09ZA6J9P8, AVFA1JB08RG8G, A20P8VC55KPPCT, AIQDUKFB4X38M, AJB5P7GVR0MT8, A11OTLEDSW8ZXD, A1AEPMPA12GUJ7, A3NHUQ33CFH3VM, A3PD8JD9L4WEII, A1BD342U8BF3UC, A1W415JP5WEAJK, A2582KMXLK2P06, A35W3JQYP0M655, A3MZNRSDQ32UUH, ABDCYK04CL6O4, A1GQAKL9CGQLP1, A1V1EP514B5H7Y, A1HOXKR7OKJ1X1, A1XVQ3KHS22E3F, A26NFIQ7KWI8Y7, A3D9NUCR4RXDPY, A1AEQZM99LO9VA, A1RRMZKOMZ2M7J, A2W9I628I6SE1U, A2YMCPP3KW9IXU, AKJHHD5VEH7VG, A16AXQ11SZA8SQ, A2R1HUYHXV7H18, A2TO2BN3P4C00L, A2OL5WLCNZVD9K, A2YHXAZLCLDT8D, A35LT14WG5BX0T, A3EPHBMU07LZ50, A3LWC833HQIG7J, A3M174IC0VXOS2, A3UCN2RGY7O6S1, A3V1A3C9DTLPME, AJQDIT55SZ3ZX, A2B8GXSCB1R05T, A3UUTDX2WNVUS3, AJCK6OKNWGIYG, ANCOMAI0I7LVG, A1XQMQMF07QZQS, A22PUBSSNP54L, A38KP1POQ191WT, ACAIEIV03NBHY, AF3BYMPWKWO8F, A106ZCP7RSXMRU, A2SZWFJX0783BF, A2VUD4SPJO4V33, A3AZI828WJN1CD, A3RMGIKUWGPZOK, A3T0OTH5072YRE, A19SDJ2TSSL8HI, A1ODKP5Y7DPMM1, A353U0L2HAMSHV, A37CENQP0ZNKVE, A3BBC8E7QT7N9I, AQ6AGWKWMTY8H, AWKZAUC0D8DYL, A2XKJ1KX6XUHYP, A37MH7ICH80QOX, A3QJQQZTKFV7BJ, A58N07M0ZCYMB, A7EK88GF8N40F, A9NXTC0HTPSDO, AQ52JX9ES6XYY, A11ED8O95W2103, A17GK9E70O7Y9R, A1F7YU6O5RU432, A1FP5ZLSKR07SU, A1G60ANYI0HMEU, A1I85Y08VRZ32Q, A1QBOC76MIOJYP, A26HFSVLAGULIM, A26LD9FQHTM8ZH, A2KUUWP4ZZMOBP, A2T5VEAFT6PUH3, AK7CAW3N1XZV6, AK8LOFYRZJJW0, A1ONZ8JRPLBNUI, A1WOMXOEX90ARI, A2O421DTA8J0RW, A393F381MA82AY, A3D6TFYRMIV3ZL, AI0NMYA3LKXW1, A100WO06OQR8BQ, A13GZCHAMKWYBT, A2MSQNPTNAAGL1, A2RL1RS6PWUHWI, A361PLXEWB9UC1, A3DOPYDOS49I3T, ALL9XFM0Q1N4E, AMPGRXQMO89X9, AYGJ96W5KQMUJ, A1B6O7SAIYG2N0, A1LHAXBM5GBJS2, A1SCANWWQTEG9I, A1WE8KTC20NY65, A2KIVODZRTGY4U, A2LJJ4482V9LAW, A35TIC6B8MVKWG, A4DTM6B4IBYQX, ADLVFFE4VBT8, A13MKSASQ6YWL7, A1DH3QDZX8Z7GO, A1TJT6GXDGNN8Q, A20OQMLRFNZADL, A2NOW4U7W3F7RI, A2W9B725TZBXOX, A3EFSLEMHNPP6A, A3QA0BBQW08DLZ, A3R9H6OKZHHRJD, A5CR6GP49HVEE, AT9U5ZE5OO84C, A13K3ZLWAWN1EI, A1IH42TUIZ2XJL, A1JMR1N9NBYJ1X, A1X2LENOF84LCQ, A1ZSF5CJ0A4CIO, A29M09QBG9TZLP, A2IYLMDQGBB4VG, A33REC3J2JU2EL, A35X2JJI49OBZP, A6GMEO3VRY51S, ACAXV4V8PBCE3, A10G136JEISLVR, A13WOT3RSXKRD5, A1A1BM6N28X9J0, A1N5FSCYN4796F, A2158Y2U61AU9G, A2UCZAWAN5QMJQ, A2X3L31KCXBHCL, A2Y4S4CNGKF21S, A2YSFKX18XTHED, A36JDIN9RAAIEC, A38RWVWOQPYJSA, A3MDETK0D5UAIN, AIEEK7AHXKZCC, A12ENBT314RFXR, A18L1CVUIQRE9L, A1H7Y5XKPGT0OS, A1YP5WLIHGG136, A2AOD7254MCKSH, A3GGXJD0BMJ2W3, AEL6CQNQXONBX, A1IRN1M05TPOVT, A1MKPMJPD22YY, A22Z9R91N8L7IQ, A2A9X58G2GTBLP, A2L01339XV496V, A3HJHV83O2U8BL, A3KZLIEGCSSM5L, A3POAWC2JPQQQP, AG7EF0SVBQOUX, ALDYWG0CPSYUF, AS44QEHT3KSPK, AUITG1DJ3QUGK, A19XBW5WUDH1Z, A1BL2TCE749NB8, A1I34N9LFOSCX7, A1R377IPZOKLMM, A1UMSB7LAW0RIR, A1YLOZQKBX3J1S, A2KP45DO3RY4RG, A36PG3D7ILZEU2, A39SCU7KSK7330, A3D0HMC6RQT0N0, A3J171NBGIBYAW, A3PZ4AXTY9J1DZ, AD2QRU9ZXBQZ1, ADHB7JK4M6J7K, ATIHDHZYNQ0EI, A11I1I9QLMAM1A, A1LTNRGWZFY4C9, A1N655X9X7C6QY, A204QN2VRUQA9B, A27NTHPTRXB766, A3CG6YLYZJXQG4, A3CG93783LP0FO, A3IR834T7AROBT, A3NID9D9WMIV01, A3TBTAX85OYRKP, A8FJHPCMKR28F, APWCOAVILK94B, ATLO3YXU2BC16, AXJ1QYBUL86ON, A1EP7ITUDTNXC6, A1FDVT0DLJWV78, A1VQBEW0G4IH1J, A2RNYW2HIQBGSM, A2WVF9ZQ068DN0, A3JHC8O59WDHFZ, A3LAYCTGSO1IQR, A3T1LD0C65QCWK, AAH6764FP1GOZ, AHKPZ11JT110F, AVJJ2D4G5I0Z4, AYWUHB7N8XGZQ, A10PEXB6XAQ5XF, A1IOGEZUZPII8C, A25C5MVVCIYT5D, A27O5ZUFAEWT9L, A28WXDXJA1P0MC, A291HTT117RVS9, A2PSC7LUNIDEAH, A2UTZ7HH4UKDZW, A325RWA8LHK2QJ, A3BTL4FV6ODKAT, A42CJC66XO0H7, A4VMQ6ZTSXSSL, A89ZZKNDFQH23, A11YOTONCPRQ9S, A1KOCGNDLF2VUR, A1M5D0DG09UGVM, A1SB8CXAUIKT8X, A2NO1TXXS9T0EE, A2OCDK0BOW6UCY, A2QDOJFFLFGF18, A2U77Z3Z7DC9T9, A2XAKGRUHIE2ZA, A348IT6M7H8A67, A35A5S6H1WROO6, A3HON67T38XCB5, A3JLECMNWC4LDY, A3QDITMY3OOYRP, A3W4D8XOGLWUN5, AAA0TUKS5VBSA, AB094YABX21WQ, AHYRTWABDAG1H, AVQIRN6E7J7UA, AYQ8RLE0K6RU8, A130VGG4P4PW5J, A1BTG38XSGYLW3, A1HLJJ6MKZLR3Z, A1P27BGF8NAI29, A1VABWDOUQLULZ, A1W0F3F6EXIAKP, A20EEWWSFMZ1PN, A2BLJGGWN8GTXQ, A2C8O554YMY2ZL, A2H2I5FY1PUHP1, A2K89R0B20LYHB, A2PL0US7RN67G, A2Q2GDB5XDYQV5, A2SH7OWE8QJYNC, A2TCY4Q5S0NO5Z, A30H2335OM7RD6, A37GFKV81AL1VF, A3A1OA237FOZFK, A3HPZ6BIMNXSZR, A3IUW081KXD3PE, A3R4794K2RVU1S, A4JSQFCKVKX2A, AN0N05A9LIJEQ, AP8D74QD9LUUL, APP35M28G2U51, AQ8DU6XVA3USJ, A15T9G38F589KM, A1BA72K4VK1UN1, A1QK0XCAPHIW1L, A1T61QP7QHYBRQ, A1X3ESYZ79H59E, A1Y09QLADQYQJG, A277GP2U2TXH51, A2OBDNQ5ZYU1L8, A2OTUWUSH49XIN, A2YQ2ZI65F37N8, A38OCDJQOAQ2XG, A3BFDEBT5IV4UN, A3IE3TQ79W0YOR, AF72GTWZGAC61, ANUUF3N6B9NTA, AUW5XC67E9MIL, A10AFVU66A79Y1, A18OUQEK7IZ2F2, A1LJR5IS0B6ADX, A235UFZGCFN3J5, A23E9ZPS2RQZS0, A23GFTVIETX7DS, A24TI0FXW07810, A27L5L6I7OSV5B, A2BCDZO1XQLDH, A2NI95Y8UNE85D, A2YNIKQDLZR2WW, A2ZEFDVX4X5TPX, A5Z6TIROUVA5O, AJV2QY96IVPVM, AO0HPTFIKQE9B, ASFW4ZMNZJKDA, A11UPNFYDICF3C, A18GKCC69KPR51, A1R1BFJCMWX0Y3, A1Z7Y2GMAP9SRY, A2GY5WCU9PKTMI, A2IUBJJBH9PF9R, A2MF0C4E7GYCI, A2QJF1B00I7BT7, A2RN5EQC3F75PJ, A3H6NNGCINPLEC, A3MFU0GVZUVH3K, A3OJX18B60PJR9, A3TD1O4EC26NT2, ABQN42N7ICNZQ, ACEA95FQS1AVP, AG6TX1ZJHLMO7, AGEKVD8JPZQMT, ANEDXRFDZDL18, AWLK6NSSV0YNA, A198JRUIP09HX5, A1PAGHECG401K1, A1VYFEJM12ZP11, A1Z7XV6JU0EV8M, A21U4DR8M6I9QN, A2E2PA6UNK1E05, A2GOE7ITDGYVE, A2H2LJCQ5DJ5K3, A2RKI7RPP5CJMG, A31RULW0KNYJ5H, A3FKPBNI7UWQFW, A3LQS08K2OBI5Z, A3P84TZX9X1B3X, A3S15YGZ6W6EV2, AATQJWMI88ZP6, ADEZOPMPKK146, AS1FCKNKY95ID, ATZAD00EIVTF4, AX668BUQRHI7C, AXQIHSF9KK7CO, A1F7SX3GNVBNE3, A1RRHET1QIP1YK, A26X7W5UM5QFT4, A2SSV6KM3W1VFD, A2UR44HF5K9FE5, A350HRB16YUX9P, A3HQAPXAJV7PRX, A3NCTCNAUYCH6H, A3RYMO6S22FMM5, A3V9TR2U1KISVK, A7G9M0IE7LABX, AAPPWNP9FWVWS, AHQ13I9CI4US6, AOINAOO0NQRGN, ATN552TF5V40Z, AYNAH993VDECT, A17O9AHKHK66AI, A1BJHZE41QWBX6, A1IL6W1NK05UW9, A1JTQCIL88W9JV, A1PG8FDKPVHXE, A1YN7KUADY6QJ1, A2AOZQ3WTNVVOK, A2GLD72HQYHG0P, A2I98OOPNIJNYY, A2OH0YZ2XEQA63, A2RHV42BTJSVON, A2RX62V4E2BF5Z, A31BD4RXCON7QO, A34BZM6S9L7QI4, A35MDIBPAX9X7U, A3DQWFWINN3V5A, A3H7AOFQDPU0JV, A3N4CUW4UYC9I3, A3PECZX773ME74, A3TP31S61PPE3G, A3U029B8Z5WGI2, A3UF4K552BJ1VC, A3VZH0PWLQ9BB1, A87RT63V7SMD3, ABAHKMFEHT8K1, AC57A1QMUXK10, AGPLJLVQ47QLT, AJLW1DZSHOVGW, AKXCQP3DLGW7F, AMDREWLSOT8ID, ARD5NJPT3E59, AVZ1SYMD26S4R, AYBYYDVV5ABJE, A10H24TDLK2VDP, A185QFJRTB5W93, A19XMHRB3G4DIR, A1H703P9ALYVM6, A1HBC0NBQJHT7X, A1I477ADGMLVJM, A1MFG9E45RX5OW, A1WG5SD91EWYXZ, A21XUSS7STBPPY, A22S7D0LP8GRDH, A2AVYSXICESSTK, A2K3J2X8KDY47N, A2N2X7L7LB3S6X, A2OAYIM13WIXCH, A2OZ6PW2W5FQTP, A2RHI9QSU2H31E, A2VJJ2POCLMED7, A2WN1QF8GSVHYV, A33PLZ7SD5MCG0, A3HAA7H8PBVM78, A3I2WE58OUUEXG, A3I5YPJZMTG1QO, A3JCWGHCVC2ZNF, A3P8ZDHC7XSKSE, A3VBXQKRM7A4JR, A3VDQDVHDE4PYO, ACD4ORBZEJV6, ACR4HKUT808U1, ADMWYMH11LD27, A1D0N7I6OHX3WU, A1HGXLP6WATS4B, A1N4NAIHZF4J7X, A1Q4MNIUESQTBM, A1ZGHA3IJV01BK, A20IQLFES5BDPG, A21CZIJ7LXR1A1, A21VGNU5959O85, A25KVM6GJBLISZ, A28CCN6VYHRUKS, A2FVD05Z2FYW1P, A2KQT4D0OZR569, A2OOQ59V7YWYL1, A2PR6NXG0PA3KY, A30IP3E4MDQ36, A3A90CELVLOUP6, A3F1G6UH4Y39X2, A3KUC5K5VSJNU9, A3OO4WIO4SKD55, A3QS4WWC1LCA6H, A44OY8EFDM4IP, A6TOGEJT5XSCI, A7EJERNB7IK3Z, A7UPJYPAH73NC, A966L65JSN8XN, ANMA1H8LGEVBF, AQ3IN3MRXQ5KH, AZ5X928CQPRJN, A1FEP94TP15RG0, A1IQV6AI7L9NOK, A1J5HIF41ENSMZ, A1JAPP1CXRG57A, A1Y39T2CT36YL0, A1ZCSSCAGBCD49, A29V32IOAJUP8P, A2DI7UGT3YX4Q9, A2E7RX6AFUDQEX, A2II54B3VA45LN, A2KZRK2T9KFA0X, A2PF32UUERJXB8, A2V0I904FH7ABY, A2V18JN5XI2GOB, A2WLS1TTUUGJYU, A2WS6FMF750EI9, A2YIP1EF88XCDV, A2Z4TQN4C4WSSB, A33ZYFE8XMKKR1, A34U4Y40W1GW9I, A3HRDRQ5VAFPQS, A3JOYNYL458QHP, A3MLESXA2VGWJC, A3SMV35531YME, A3T3S48UAVTUE9, A3T4OHEAHOJ700, A688RIZ2POWSQ, A8INT3NMHRUS4, A8P8KPVXCWV9R, ABNMD6670TV53, AIIR8E34EDKCQ, AORGKBNQZ83O8, ATDE9JYCPI0L1, A10Z8FC0SMU5VQ, A135XHGMBR0OWF, A1BVE2ZIBKJ7YI, A1ITRGMT80D5TK, A21B8AV7E3MPXE, A22JHOEDZED75E, A26N3GLFUNS4NL, A2EWE0GMBBUVMJ, A2GR7SRMJ54RG7, A2JBZHQVQF7MV0, A31ASDA3Z5BCYZ, A33DKGANHQJSXC, A35Q0RBM3YNQNF, A37USOKUTI724H, A3B1360JOYS0GJ, A3DZFEICHK5LF2, A3EPJSPH03AS29, A3F8JQ5J29GWUV, A3H7NPNDMGLOU4, A3LX57I5OKG70V, A3OBP99ZV5TG6C, A73DFWJE0CGY6, A9GIGJUB98JNR, A9KLAL1CXZ0W5, ADS99W8WMEXZ2, AEP0XAC6F8N2Y, AF7DZ97VNSEWN, AG90OGHDGOOVH, AKACGHPVILE9R, AL1XV4L25FZ2S, APVK8GGSSUDCE, A14R9XMZVJ6INB, A1D7SKBDFLSKFX, A1J2JXJLPXQOPS, A1KH5JOTGUPJD, A1WBEIH7Z37LN9, A1XG5WYLFMRRX1, A1Y3XPZK9ZADFW, A1ZU55TM45Y2R8, A219WUOP4BNUX1, A224KM22RQ5CD4, A27IHE8E5MGKG3, A2EONLXLVTBKB3, A2HLL8L5QELLLO, A2K1BVRREVIX0T, A2NML53YCHS80S, A2QSBOAAGW1I1H, A2SLX6UHHYCMCV, A2Y695A1DXMT1J, A2YO8731SKDKLL, A2YW1MG1GKU8XD, A33PVCHCQ2BTN0, A35HOUWHAYZZN6, A36K2N527TXXJN, A3B6FOHAAOL7G3, A3EAP2VG0BVYWX, A3EXWV8FNSSFL6, A3J6TE3SKSYBUI, A3UKWQS8SRW6IO, A3VLCQX7NG1N0E, A3VYKXHQDICC6, A3Z9QN0RCOHEY, A7MXWFCWVXJZE, A8WAYVOKYBLO6, AG4U11RFDY7LU, AGTO21BHY08LF, AZ4T61QUJHA9E, A186ZAYP2L4CDZ, A1CVN6FWUCZOMD, A1F1A0QQP2XVH5, A1F9Z42CFF9IAY, A1FWFCJU2G7TRA, A1GV4HEM6XZC06, A1L7R2764ED46Y, A1Q8QT6GOH6SEX, A1QR76SYGTXJN5, A1UASXJKH475MV, A1VBDMNT6I8RE5, A1XFKWAR5STF0, A1Z3XWG2W5GOHP, A216NSW58Q3SCJ, A22U8V3UVVBP7M, A28ZDVY6NV75P, A2AXRINZGFJIEE, A2CV33795L4KHH, A2D72VZ2YNPSFG, A2FIZ75BHZKFL7, A2NMQWBDWT3SQF, A2T0V99GLGXWCM, A2WW57XX2UVLM6, A31YSTICHFYN7O, A32R0HBCV9FCJM, A33YZNZIRA3H97, A34E1744VPQCNU, A3774UJAKO4FHI, A39EW9DLVX70B9, A3FHSLWEMH7JD8, A3GFK7F5IUF60X, A3HED8SW5DDP9Q, A3KZCNV1N8R9GC, A3NOBH42C7UI5M, A3UW0PQLDUACMH, A7C7QG6O3ZHXD, A8DR6JIHBM6K5, AEO407GROR6JB, AI0BCEWRE04G0, AKCZIJ6ZHE41D, AN0U0GNJJPEUR, AODWFJHMNL0FG, AQ2FC1DLKVD8H, AQM0K7MBBT4AY, AWIF8AR75LL9L, AWM1KZ2MDOVWJ, AZXKAH2DE6C8A, A12O5SEIF162P8, A18GJ9MYYO6GCQ, A1FS3GMCEMFB2Q, A1IKOG44PHFNYS, A1L9O8FL2REQTE, A1NBK07JEBCFI, A1R5Q4GXSYSKPH, A1SYLII0808HD6, A1UN5Q1FKH1ZT7, A29VG90T649CSU, A2B5OI74EHGVH1, A2IFYWQ4RC21NE, A2NVX117EFIW7Q, A2NWIBURBR217A, A2P7TE7CVQAHH7, A2QDBOHV00NOR2, A2RKZ839WIWVHL, A2W0XCWOK3MW6F, A2ZMMQ4W17EK2N, A35V32HZEGZH04, A36GEDLB5A5MJ, A37Z843SR49K8P, A3963R7EPE3A7E, A39Y59C6FTC0GL, A3CW0ZLUO5X2B1, A3DH53FPYSP9E, A3ENN12GLNTUAF, A3GJQ3W0T0KWEO, A3LGT6UZL99IW1, A3RUMVZZ7W2E2S, A3SMVB6EXX8OVH, A3TX6CWSZL02PW, A3W43ZV9NIVHCE, A56JFSLUCHI4J, A7RFDGVXDYQLJ, AB0Y33G717HOU, AEWYUPCNDV7HY, AK0CENM3LUM28, AOEUN9718KVRD, ARIGM9KNMLQNW, A14H5GNH2EIPAC, A14RZUPW44KCPF, A1HG82U7GY9531, A1J52MX2YDWSU0, A1K4AIPL0NFAGF, A1PB97BLMR9X2S, A1UWE64CPO197G, A1Z8ENYSB5AU74, A23GS4UGLQBG2V, A23HRTD9I9K90Z, A24HT9FC6OU1J2, A25UTJ1AXFC0Z9, A28GRFVAA4DU5P, A2C18CH1YC6BYT, A2DB720I9XRX7K, A2G0DMUKJUFQLD, A2HGH80EGNOO1I, A2HKU4SOT0CWG9, A2HQ8RTAJYEUJO, A2J19U8H5SSFCJ, A2KBFB6A2D7PNO, A2NP8RNW9T5BQF, A2S78HC3GA9W8M, A2SRB4GMY8I8X7, A2TPH171QFO6ZH, A2UTU1T0P7YTSG, A2V9DTXTQ5YIMK, A2VBL3JMMB282U, A2WNN1DQVL4LH5, A2XL6TZM34HFV3, A2YWRWSLEJRM92, A315S3F1NHG7Y8, A31J176KH7ZZEY, A36Y4XHEHNGZ7B, A37I99GFZ1B6YO, A3E5KPDJ9OMGL3, A3EP6YVAYS9YM3, A3F7NO1Q3RQ9Y0, A3IYSIAKYOMKTO, A3KE6TMMH3BG00, A3KSXW1MF1GRHQ, A3PFI1B6M35CIN, A3R33KMESG0XGQ, A3TA1UJWRJF9NC, A4JS8BC0B8Z65, A4QXTN3K865NR, A52X1I4UT56KL, A5H8NA5CJ0FK4, AAX6FRNBEU9PK, ABC68JUCPTVOE, ADY836HK6QSYR, AF1H4YRBRMBB9, AFV2EMFYRRKQZ, AH6BI8F3EE6K1, AHIK7BUXFRMT8, AHRNDSKWH1YBT, ANY74IVWZPZ3, AO09RWV40IX78, ATUXNR3WHD18N, AW3VZ5O895LRK, AY52TNOUURNB8, A10LIGIT9EGCM9, A11PTCZ2FM2547, A137Y8DXKXIEJ, A147FUNITGB21I, A15ASTBZBU7AXD, A15USNEAJUXOSH, A1921EUFI0U519, A19GSC3QMK694Q, A1BKJNAWJT2TG2, A1C7Y31S5QXNTR, A1CSB9FS3SLHJO, A1DC1O4VX6AHPP, A1E0NXRTGYDN45, A1EE6LQS3OPY6R, A1HZHZ9XH5RR7N, A1IHK8GL1ESOND, A1IW9LSLZFW9FK, A1KZUXE70GYNGO, A1O8B2WYDCPTIQ, A1P6S7F4MD476C, A1RFM786MYBG8G, A1RTUXC9W70SIF, A1URMXEEWEQR6V, A20WEEYX2YQXW1, A23KZBVCFKW1XS, A24PZR4W555WQI, A26JYIPTHH25VC, A2ASW6L6IEKU5L, A2B7T28EARM3KA, A2CLDRW7GVDOZ1, A2D7X9N3IV3S7B, A2DHA9BIS3NB2H, A2I6FFCUE6KID9, A2NQKBC54RAZL5, A2NQWPJ8EBWM3L, A2O8XS3QNT0QN4, A2OJCTT5WLB2HR, A2RQOO8VYAEZZG, A2S26YGSVXBCFL, A2SS44O400KIZ7, A2TXMYYGSZCSZ1, A2W225SFTQNF3N, A2WB4OWBUH2VQX, A2XIOXRRYX0KZY, A3091RP0SPZLMN, A331T1MEPUCBYV, A33NXNZ79H5K51, A353Y7VBQHHW0T, A385E4RHJS3T57, A3AOF4C0MXEQSP, A3B6TOEXSQVO24, A3C00N4UHA5XYX, A3C9Q3KTNNLJJ, A3MEMX0XF00TBD, A3NVNHJ1SJW080, A3PNBZ60XRKZFP, A3QYDL5CDNYN66, A3QZ6JT0R1OWEC, A3SDBL8SJC2ME3, A3T8WOFS5RD2IR, A4902TQB4NGRJ, A6YEAHCVOHKWM, A9101KNY0S3H2, A9PKYI8B9V9VB, AAVXLDJPBOJBW, ACJ9N7ED37HXS, ACRZORZLEHJX6, AF51KJB3W1YI6, AFUM9UDF7IN6I, AGFV9F4CI93S3, AIFGUCOUOOFJ3, AISQLBDGS2KXR, ALP0E9PM8G9GK, ANYAQ3TVKP69E, APP5MBH2BSX6I, AQ6SHOW0VMZGF, AT0J9IP8XD95F, AWPODHOB4GFWL, A12DQUAJN9QH23, A13QLFTU0I8PSZ, A14DNCG5WHM86Z, A16I6WJUEBJ1C3, A16V6Y0BWZAGNI, A16YU3GRGCD95S, A184ZFZZBWEXMS, A18IZ3RTL9SD4V, A18NJ23KZ9LBOV, A18V316U2HXALE, A19UTUEBWKIZFT, A1ACM1CBGORBN1, A1BKX9MC3YAKF8, A1CVEGNOQ62A25, A1Q3VZH3TP8DFN, A1S3DCJ9T7GAK, A1TIVD0Y3KJSCN, A1XEHQJ0UHJ18E, A1XJOSJN6FHFO0, A20DDH4NT6Q1E8, A20H1M28WLI9J2, A20MMCAHGALRAX, A23RZIU0N8K2KR, A23US7MAW915K5, A276BKCK4ZE7EW, A27PFOZAKVK484, A281387UUS2IN5, A28QTVEFQX6Y9X, A29NQI0OT0Q81S, A2CZ4OA313WSKS, A2G9M92C9FBUEP, A2GPIFSNT7VXPW, A2HYHT45PHNIIG, A2L6QS8SVHT9RG, A2LZKUARB5Y8C2, A2NV6EVUDPV0OP, A2SB0OKNB1ODN5, A2UT0FWM1DHKFJ, A2VBTN6ZR67YOF, A2YGDUFEV2B7TO, A2YYUOXGL9JGZT, A35JPD8Q492FJC, A36DVRTEHDJKNP, A36E68YOWHTIDN, A36FEPUTDN12KA, A36NUDST4Y5JBA, A36VNMYPXBSTQ3, A37D2TGTIXRV2N, A3BAE79NXFDXGV, A3C40PJ9YXREQ5, A3D9Q8V4FGLA82, A3E9OJWHMXMYYF, A3HGBBGUAF3D8H, A3ICDLUQ3V2QY2, A3IMFBFX5L85S9, A3KDO3XV0MK1GX, A3KZ7OH4VRL048, A3N4VTNFPMTHEF, A3NMA7RSO2HMBG, A3PJRR03ZAFWGR, A3PJSAXKHJLS1E, A3QXJDENZ9DGFU, A3S3R88HA0HZG3, A3T6HX48F66512, A3UCO7B9HP42BG, A666QET48NULX, A8LVI41BC3DWJ, AA0YPCLUF78B4, ADAOC6UTL8ZZV, AGZKJ1RCAT9Z9, AN81JUYW2SL24, AP03SDCDB6RBD, AQH1SWR5HA413, AR3EVUQF0AC7R, ARRNOA2H9V4ZZ, ARXU7TM4XXI1D, ARZLW6MFV58E9, AXSV2IRQX2C20, AZWRZZAMX90VT, A101P2KHWCU0G6, A1051DBTLWP5A2, A10TYGME2FQHO7, A1ATV7O231DXIS, A1D7HM0MMEAKUN, A1HM9ZCU43N6XD, A1J75JJ0Q2OEJN, A1J7RSVCF7F7B3, A1JFNZ4UAMEZN3, A1L91NLNUQSOEW, A1M5KRVMD7XEC4, A1OYAKYIVT3179, A1QP7KX8ANVI00, A1RJUXDK64O91A, A1VGXHHR08G044, A1VUN4JU731CBH, A1YGG6T4YJZWC1, A1ZGXZW37JEZWH, A20XWDZHAXIYOK, A20ZM1V1IRQHH, A21ESVL96WF620, A22363SZW4OLJ6, A23LSQMKWU1B00, A249W93JNSUZ9Q, A25UZ7MA72SMKM, A27HB4L3I1WJUR, A2AY4YUOX2N1BQ, A2B73MUGLPB65O, A2DDALFVSQTE0J, A2DV48TSVVVO6V, A2ECZDJE7AEM67, A2FS9CYCWC6HLW, A2G9UDL72YUTT8, A2GL934UT3XENH, A2GOTW3U8IIR7J, A2GZ3O8AHD3PI2, A2I5QH4F5FDKK5, A2JE8OS1NN9YDB, A2JP9E1H0SF392".split(", " ));
		List<String> expectedFoodids = (List) Arrays.asList("B007JFMH8M, B0026RQTGE, B002QWHJOU, B002QWP89S, B002QWP8H0, B003B3OOPA, B001EO5Q64, B000VK8AVK, B0013NUGDE, B001RVFEP2, B001RVFERK, B0026KNQSA, B0026KPDG8, B006HYLW32, B007M832YY, B007M83302, B000KV61FC, B000KV7ZGQ, B000NMJWZO, B000UBD88A, B0013A0QXC, B005K4Q1YA, B005K4Q34S, B005K4Q37A, B005K4Q4LK, B003GTR8IO, B0090X8IPM, B005ZBZLT4, B007Y59HVM, B006MONQMC, B002IEVJRY, B000PDWBKO, B000PDY3HI, B000PDY3P0, B002IEZJMA, B002YJ0118, B001VJ0B0I, B002LANN56, B0029XLH4Y, B006N3HZ6K, B007TJGY46, B008FHUGNQ, B000CNB4LE, B003CIBPN8, B004SRFYMK, B004SRH2B6, B003TC7WN4, B003VXFK44, B003VXHGDM, B003VXHGE6, B003VXHGPK, B003VXL0V6, B004FGWU9O, B006N3IE6A, B006N3IG4K, B0041NYV8E, B0007A0AQM, B0007A0AQW, B000BRR8VQ, B000H0ZJHW, B000H0ZJIG, B000H1217M, B001AS1A4Q, B0029ZAOW8, B003D4F1QS, B003D4IYSU, B003D4MW38, B003D4MYLS, B003QNLUTI, B000GAT6NG, B001E8DHPW, B004EAGP74, B000ENUC3S, B0018KLPFK, B0018KR8V0, B004GW6O9E, B005HG9ERW, B005HG9ESG, B005HG9ET0, B001D09KAM, B001D0DMME, B001D0DMMY, B003TNANSO, B008JKSJJ2, B008JKTH2A, B008JKTTUA, B008JKU2CO, B0051COPH6, B003QNJYXM, B007I7YZJK, B007I7Z3Z0, B001EO5U3I, B008J1HO4C, B001LG945O, B001LG940E, B001LGGH40, B003Z6W32E, B003Z6ZGZK, B00438XVGU, B00451WLYI, B006H34CUS, B0034EDLS2, B0034EDM2W, B0034EDMCW, B0034EDMLI, B0034EFIYC, B004ZIER34, B000EVOSE4, B001LGGH54, B004CLCEDE, B005K4Q1T0, B005K4Q1VI, B005K4Q4KG, B005K4Q68Q, B0076MLL12, B000H7LVKY, B000UUWECC, B002GJ9JWS, B002GJ9JY6, B008ZRKZSM, B001RVFDOO, B0032CJPOK, B0081XPTBS, B004BKLHOS, B001D0IZBM, B006GA666U, B006N3I0DM, B007PA33NY, B003XDH6M6, B004JGQ15E, B000DZFMEQ, B005IW4WFY, B008RWUHA6, B008RWUKXK, B004TPKAN4, B004FEN3GK, B004U49QU2, B003EM7J9Q, B003EML8PM, B004YV80OE, B0001ES9F8, B005VOOKS8, B005VOOL00, B005VOOLXM, B005VOOM2W, B005VOOM4A, B005VOOM5E, B005VOONGM, B005VOONI0, B005VOONKI, B005VOONLW, B005VOONM6, B0061IUIDY, B004OAZ36I, B0083T5TAQ, B000FFIL92, B004JRKEH4, B0045XE32E, B004E4CCSQ, B001ELL60W, B002GKEK7G, B00305L330, B005ZBZLSU, B007TGDXNO, B000QSON4K, B001BS4G6O, B003E728CE, B004E4EBMG, B008GRONV6, B002AQ0OW6, B000HDK0DC, B001EO5Y8Y, B001M2BM4I, B0032CB15Q, B00474CSVE, B004779XNW, B0049ULB78, B007PA30ZU, B001EQ55RW, B003QDRJXY, B004U43ZO0, B002NHYQAS, B004MO6NI8, B000HDK0D2, B0009YJ4CW, B0012NUVN0, B0012V1G0Y, B003FDC2I2, B003FDG4K4, B005V9UG18, B000HDI5O8, B000TQEWM2, B0029XDZKI, B002ZX1U9A, B0062A87HA, B006N3I1HM, B007TJGZ4A, B008FHUKE6, B006Q820X0, B000NBQUNW, B003Z6ZGZU, B004TJF3BE, B005K4Q1RW, B005K4Q1W2, B007PA32L2, B009RB4GO4, B005HGAV8I, B001BCVY4W, B001BCVY9W, B001BCXTGS, B001BDDT8K, B001BDDTB2, B004YV80O4, B005A1LJ04, B001EYUE5M, B003JA5KKS, B0047RQ9M0, B007PA30TG, B007TJGZ54, B004P4POZ8, B008BY7NSE, B009E7YC54, B005A1LINC, B001LQCOIS, B004WTHCO2, B000VK08OC, B004391DK0, B006N3I29E, B0083T6HC0, B000FMZO8G, B000FMZO90, B001EQ55ZO, B002AQ0OL2, B005BRHVD6, B000V17MLS, B001P3PR54, B0009F3POY, B000OQ2DJQ, B000OQ2DL4, B000WVY4PE, B000WVYB8Y, B00125ZCWI, B0019QT66I, B001E0TBA0, B001E18K8S, B002LN1ME2, B003SSWCJI, B000G6O2QG, B0012XBD7I, B001SAXPEO, B004728MI4, B00472I5A4, B004E4HUMY, B0058AMY10, B006WYSFZK, B000G6MBUA, B000G6RYNE, B000LKVD5U, B000LKXBL4, B0058AMY5G, B0058AMY74, B0058AMYTC, B001OCKIP0, B0098WV8F2, B001EQ5JLE, B004JRO1S2, B0016PC4TS, B000CQBZPG, B000CQC05U, B000CQC064, B000CQG8K8, B000CQG8KS, B000CQID6U, B000CQIDHY, B003CK7O36, B005ZBZM52, B007TGDXMK, B000LQORDE, B004JRMG98, B000CQC08C, B000CQE3NM, B000CQG8AS, B000I1OLT2, B000JOE224, B000SDKDM4, B001FCFYU8, B001FSJCPK, B001HTKOWC, B003CK2BQG, B004FEN3GA, B004CYLW7A, B001TLY7A8, B001TLY7BM, B001TM70V0, B001TM70XS, B0001ES9FI, B00141OU50, B00141OX52, B00141UC9I, B00141WDXG, B001AJ1ULS, B0044CPA28, B004FELBH8, B004K30HO2, B000EDDS6Q, B00004CXX9, B003ZT61E2, B000EVG8H4, B000CQE3HS, B000CQE3IC, B000CQID1A, B000CQID1K, B000RI1W8E, B0030VBPN2, B0030VBQ5Y, B0030VJ70K, B0030VJ79Q, B001E5E0D8, B005GRCWDU, B005GTWCTM, B005GX00BK, B005GX8MMO, B005GXHKSG, B004T3QMD8, B000FI4O90, B000REI2X6, B004Q3LBTG, B00004CI84, B00004RYGX, B001P3NU30, B005SPQENY, B000FA38ZY, B005A1LGIY, B007RTR9DS, B007RTR9G0, B001D0GV90, B000X1Q1G8, B0041CIP3M, B0029XDZDK, B001L4JH5I, B000YSRK7E, B000YSTIL0, B001AHFVHO, B001AHJ2D8, B001AHJ2FQ, B001AHL6CI, B001KTA03C, B00248EE4O, B006N3I3I4, B007TJGZ18, B00954NY46, B00954NYVY, B000084E6V, B000ET4SM8, B000Q5X876, B000Q5X8DK, B000Q611U6, B0015MY6PC, B000ZSZ5S4, B001EQ4P2I, B001EQ4QJK, B001EQ4RBM, B001KVPBS4, B001LNTY70, B004HOLD4W, B004HOLD60, B004HOLD92, B004HOOZEW, B004HOQE64, B004HOSGWE, B007JFXWRC, 7310172001, 7310172101, B000255OIG, B0002DGRPC, B0002DGRQ6, B0002DGRRA, B0002DGRSY, B0002DGRZC, B001B4VOQI, B00004RAMY, B001J9QBU4, B002DHTWNO, B00315WGNK, B0039556K2, B00395570G, B00395DVQS, B003JA5KLM, B005ZBZLPI, B0078Y6CN0, B0078Y6OX8, B007PA32OE, B007TJGZ5E, B00817GPWQ, B008GRIB0A, B00014DXCC, B00020HHAO, B00020HHE0, B00020HHGS, B00020HHHC, B00020HHK4, B00020HHM2, B00020HHRW, B0006I5M2M, B00073IVAQ, B00073JVFU, B0009VO58S, B000FVBYCW, B000FVDWU4, B000HJ7AIY, B000M0F58U, B000VJYTZM, B000YSQ9GC, B000YSS7EO, B000YSTGGW, B00142BX68, B0014ATRV8, B0014AUJII, B0014B0HWK, B0016B7Z32, B00188S3PM, B001GCTTRQ, B00412W76S, B007RLRCLK, B000CQBZOW, B000CQC04Q, B000CQC050, B000CQC05K, B000CQG87Q, B000CQG89Y, B000CQID2Y, B000CQIDHE, B000CQIDHO, B0012BUR8Q, B003CK0XC0, B004OQBC8K, B007R900WA, B001P74NXM, B002HQLY7S, B003N0ZEKU, B004X3VRLG, B007TJGZ0Y, B002D4DY8G, B004FEJ968, B005P6TCGW, B005PANYEY, B005PIJQC0, B0075JTH7Q, B0041CIR62, B005CUU23S, B005CUU25G, B005GBIXZM, B005GYULZY, B008O3G25W, B008O3G2GG, B008O3G2K2, B000FI2VHM, B000FI61OQ, B00271OPVU, B002QGK2V8, B002TSA91G, B002TSA91Q, B0083QJU72, B006J4MAIQ, B006J4MAUE, B0009ETA6W, B0009ETA76, B002DLXXHG, B007PE7ANY, B004JRXZKM, B000FFLHSY, B000ILILLQ, B000ILILM0, B000VK33C6, B00139TT72, B00139ZPKM, B001AIQP8M, B001D0GVAO, B001EO77FC, B001EO77FW, B0033HPPIO, B006N3HYYS, B006N3I0N2, B007OXJK3Y, B007TJGY4Q, B007TJGY5K, B008FHUFAU, B000084EZ4, B00008CQVA, B000WFEN74, B000WFKI82, B000WFKWDI, B000WFN0VO, B000WFORH0, B000WFPJIG, B000WFRQQ4, B000WFU8O6, B000WFUL3E, B002AQ0OS0, B0043WOANY, B005DFL4PM, B005PXZ6JM, B008BY7O9W, B008CTBK7S, B000WB1YSE, B001JU81ZG, B001OHX1ZY, B0030VBRIU, B0030VJ8YU, B0030VJ97Q, B0030VJ9K8, B003G52BN0, B008YA1NWC, B0008IT4OM, B002OL2MWM, B0030VBQOK, B0030VBRCG, B0030VJ818, B0030VJ8E0, B0030VJ8PE, B008I1XPKA, B000EML7DS, B000IHJEDE, B000IHNCQO, B001P05K8Q, B001OCKIBY, B0039LVLS2, B0039ZOZ86, B003A199AI, B003AZ2ECY, B003BJZMSM, B0032BXUJM, B0045IO37Y, B00866AM2G, B000EVG8FQ, B000EVG8HY, B000EVIDWW, B001CWSKFC, B001CWV4RS, B001CWX7EG, B007TGDXMU, B001NXHY8Y, B001NXM3GM, B001NXM3I0, B0040K41MY, B00014JYNO, B000FNB3AI, B000FNEX8C, B000FNH1C2, B000FRSSFC, B000UVBYRM, B001181NBA, B001GL6GBE, B001OCBT3U, B0002ARQYQ, B000F6SNPS, B002HFPW6I, B003A23HZK, B004OVWQDA, B0006Z7NOK, B000FL08B0, B0012C2GFM, B000DZDJ0K, B000ESLJ6C, B003JA5KBW, B0045Z6K50, B005HUVI0E, B007L3NVKU, B000CRHQN0, B000GAT6MM, B000SATIE6, B0012C7VLG, B001EQ4OWO, B001KQAR24, B0029NTQ1K, B0029NVJ4M, B0029NVJNI, B0029NVJX8, B0029O10P4, B005GIF5UQ, B005GIF5VU, B005GIF5WY, B005P0NLJ2, B002AQP5MK, B0041LHND6, B001D0676C, B000CPZSC8, B000E8WIAS, B001E5E3JY, B001PQTYN2, B003KRHDMI, B000CQ01NS, B006N3I69A, B0081XIA1E, B0081XIAOQ, B0081XIASW, B0081XIAUK, B000084ETV, B0009XQWDM, B00112ILZM, B001D9JC0G, B001DY6TWU, B001QE7J2G, B001QEEXCK, B002ANA68G, B004R8J8E0, B000W5SLB8, B001E5DWW8, B001E5DXH2, B001KUSLGY, B000TK6LBS, B00474OR8G, B004DN9LCS, B004OW342G, B005HUVI0Y, B00764BRS2, B007PA33KM, B008FHUDW0, B00012182G, B000LKU3A6, B000LKU3DI, B000LKU3K6, B000LKVL16, B000LKXJEI, B000LKZD4W, B0015R9BQG, B000EQT4MA, B000EQT574, B000EQT9MK, B000EQVAFY, B000EQX57K, B000EQYQBO, B000EQYW0E, B001BLXRPC, B001BM01BE, B001BM3C0Q, B001BM3C4M, B001BM4NAE, B001BM4RC8, B0027Z8VES, B0032B0BD0, B00507A02Q, B006BXV1H6, B00370CFR6, B006BXV130, B007OXJJQ2, B0000V8IOE, B000812K0O, B000GZUBAS, B001E5DXEU, B000SATIZA, B001HN5Z4K, B003YBLF2E, B004779XSM, B007OXJL0G, B001E5E0Y2, B001P3NU3U, B001P3NU44, B0033GMSTY, B004DBS2TI, B004DBT12A, B005HUVI40, B002FJM9SU, B000AQFQC6, B000CQBZQK, B000CQC0B4, B000CQG8B2, B000CQG8M6, B000CQID7E, B000CQIDJM, B0002E2GQU, B0002I0GUY, B0006MWNP2, B000FFLHU2, B001942GAI, B001BOQ3SW, B001BORBHO, B001BORBM4, B001BORBMY, B001E5E2RC, B001ULH7P4, B001ULOTKU, B0051ZCNIQ, B0051ZCSB8, B000E1HVR0, B000EVQWKC, B0010UOGWM, B0013BTP9C, B001ELL512, B001ELL9GI, B002AK88SY, B002AQL00G, B002T0GXNC, B002T0IHJ0, B002T0IHPO, B002T0KDNI, B002T0NWKE, B002T0NXK8, B003561V40, B003YV46WK, B004M62D5S, B006N3I84I, B006VRTQZG, B008FHUCNU, B001P05K7M, B001P05K7W, B004772OWE, B004777F3M, B004779XHI, B004EDZ87Y, B004EE2UR4, B0089SPENI, B000EDG3UE, B001E5E074, B001E6K63A, B001GINOP8, B001GINOQC, B001P3NU4E, B001P3NU4O, B003GS3VQ8, B003GS5FMQ, B005MWAM72, B006WLNUWG, B007POT6RM, B008ATDIDE, B0009XSXZM, B000ED9L9E, B00503DP0O, B00099XNZ6, B000EMPNCE, B000EMU2BG, B001E50THY, B001EQ4H7G, B001EQ596O, B001M050CA, B001M050CU, B002HFRAN6, B002HFWMOI, B002HFWNAQ, B002HFWNKG, B001D0IZ4O, B001HTJ2BQ, B002AQP5FW, B002PI82P0, B000E1VF86, B000E1ZUQO, B000E1ZUQY, B000E243R0, B000E243RA, B001189I3A, B0009YUEG2, B001M08YZA, B001Q9EFVY, B001Q9EFW8, B004JGQ15Y, B001BOVE54, B004AWTR6M, B004T80BYE, B000O5DI1E, B000VK4K3W, B000VK6TKO, B000VK8HJ0, B001397WV2, B001397WYY, B00139C3P2, B001CHJ01A, B001PMC3O8, B001PMDYV4, B001PMDYXW, B002R8J7YS, B002R8SLUY, B002R8UANK, B000EDG430, B002TMV3GC, B001EQ5JLY, B001SIRU42, B001SITWC0, B001SITXH4, B001SITYJ6, B001SIXXWU, B001SIY3EC, B001SIY3O2, B001SIY414, B001SIY5NQ, B002OFUBJO, B002OFUC8O, B002OFZM8O, B002OFZMPW, B002OG1NUO, B005OVPK9G, B008EG5ADY, B000XEV9YE, B0016BAB42, B0017M5V9A, B002CENRLG, B002VLZ8D0, B0033HPPIY, B006BXV176, B007OXJKF2, B007RTR898, B000FKQD42, B0014X5O1C, B001E5E25Y, B001E5E268, B001EO5QPA, B001EO5QZK, B001EO5R04, B001EO5R0Y, B001EO5TGQ, B001EO5TIE, B001EO5TJ8, B001EO5U8I, B001EQ5OAA, B0029NGX34, B0029NGY4M, B0029NIFXK, B0029NIGMA, B0029NII3C, B0029NIIKK, B0029NLV8G, B0031U9UZC, B0031U9VI8, B0031UBWLM, B0031UBXDE, B00401OZ1U, B00430B73W, B006H32VYC, B006Q7YFLQ, B006Q7YG24, B006Q7YG2O, B006Q7YG56, B0081X097M, B000GQ80TQ, B000H27NU6, B001EQ5ERI, B00271NNLI, B002TN49F8, B0038B3AAK, B004R8L71W, B0061PPLYI, B000CQBZV0, B000CQC0BE, B000CQIDAG, B000CQIDK6, B000E46GGO, B000E4ALHY, B000GZSDSA, B000I1RHMU, B000NIFO96, B000P52FLW, B000P54HVS, B000XSGMHO, B000XSJLW2, B001LXYA5Q, B001O023FK, B002TMV3CG, B0037QGKSK, B003BGRUPI, B003CK0WLM, B003CK7MME, B00503DOWS, B007RTR89S, B000EVMNMI, B000H241DS, B002TMV34E, B004P4TL8E, B000LKZ3GA, B0012Y0HA6, B0013E7C0S, B0014WYXYW, B007RTR8T8, B00008JOL0, B0007A0APS, B0009JJB6G, B000FK63IS, B000ILEITA, B000WFS9G0, B001BM62T4, B001D9RVMM, B001D9ZV5G, B00390T5JA, B0061IUKDM, B007RTR8A2, B007RTR9E2, B000FBMFDO, B001CWV4PA, B001E5E1MI, B001T4UMM2, B002YLI9E2, B0060JNAE8, B007K449CE, B0014WYXQK, B001P05K6I, B002TMV3E4, B005OVPKCI, B007RTR9FQ, B008EG58V8, B00004RBDU, B000EVMNP0, B000FFIEL2, B000FYVKRS, B000PSTGKW, B000UBH9YE, B002MO765O, B002TXT502, B004867T24, B0061IULW2, B007RTR8AC, B007RTR8UC, B000Q6XR0S, B000Q71L50, B000Q71L5U, B000Q75354, B000Q7535Y, B000TZ8WEC, B001D0KG3W, B001E5E05G, B001E5E0DI, B001E5E20O, B001ZWHGFO, B002YLGA0W, B003YK72LS, B003YK8YL0, B004IJFZ54, B004IJHY4Y, B004IJJQK4, B004IJMVQK, B004YGQPCI, B006BXUVPY, B006BXUYN8, B006ZZC0FW, B0085YB426, B0085YB4DU, B00028HN5A, B000EOXQS0, B000ODH4BG, B00112EUPM, B00158U8DU, B001E5DZTS, B0030GQHXA, B003G1ZRTY, B004YGQPAK, B007JT7AIA, B007RTR8TS, B000FIXT2I, B000G2UUOS, B002ESSASK, B002GWFA1Y, B002GWMD2I, B004UBZBMW, B005DDCKHK, B005DDCKJ8, B007RTR8UW, B000ED7M3Q, B000EVIDUY, B000G82L62, B000VK339Y, B000VK4K2S, B000VK6TGI, B000VK8HCW, B000VKADQK, B001396HQS, B001397WYE, B001E5E20E, B001EO616S, B001PMC3PM, B001PMC3QG, B001PMDYZA, B006BXUY2Y, B007RTR8UM, B0000DGG1U, B00141OY4W, B0030F70HI, B0030F70LO, B006BXV14E, B00014IVPQ, B000SATIFA, B001AG6BMO, B001P22GHC, B006BXUZVO, B001B3JAL0, B001E5E29A, B001IZM92S, B001PICX42, B004JGQ16I, B004NM9YW6, B004UC0GIU, B0009Y8AGI, B000EVT042, B000HZH8NA, B000SDO5YQ, B001CHFUGY, B001EW5YQS, B002Z04ZNQ, B0006J32A0, B000HDONP8, B000PGQQFC, B000VTQB6W, B000VTRI32, B000VTTAMY".split(", " ));
		int i = 4;
		expectedUserids = expectedUserids.subList(0, i);
		expectedFoodids = expectedFoodids.subList(0, i);
		Assert.assertEquals(expectedUserids, finder.getMostActiveUsers(i));
		Assert.assertEquals(expectedFoodids, finder.getMostActiveFoods(i));
	}


}