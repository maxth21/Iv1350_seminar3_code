# Bikeshop — IV1350 Seminarium 3 & 4

Java-program som implementerar användningsfallet **Reparera elcykel** för kursen Objektorienterad design (IV1350) på KTH. Seminar 4 code är fortsättning av seminar 3 code, mappen både heter Se Seminarium 3 & 4 inte bara seminar 3.

---

## Innehåll

- [Seminarium 3 — Implementering](#seminarium-3--implementering)
- [Seminarium 4 — Undantag och designmönster](#seminarium-4--undantag-och-designmönster)
- [Projektstruktur](#projektstruktur)
- [Köra programmet](#köra-programmet)
- [Köra tester](#köra-tester)

---

## Seminarium 3 — Implementering

Implementerar grundflödet för *Reparera elcykel*:

1. Receptionen söker upp kund via telefonnummer
2. Cykeln kopplas till kunden
3. En reparationsorder skapas
4. Teknikern lägger till diagnostikrapport
5. Reparationsuppgifter läggs till med kostnad
6. Kunden godkänner ordern

### OO-principer som tillämpas

- **Hög kohesion** — varje klass har ett tydligt ansvar
- **Låg koppling** — lagren kommunicerar via DTO:er
- **Inkapsling** — alla fält är `private`, åtkomst via metoder
- **Javadoc** — kommentar på varje publik deklaration

---

## Seminarium 4 — Undantag och designmönster

### Task 1 — Undantagshantering

Hanterar två felfall:

| Scenario | Undantag | Vad händer |
|---|---|---|
| Kund hittas inte (alternativflöde 5a) | `UnknownPhoneNrException` → `PhoneNrNotFoundException` | Användaren visas ett felmeddelande |
| Databasfel (simulerat med nr `8888888888`) | `DatabaseFailureException` | Felet loggas till `log.txt` |

Undantagen byter abstraktionsnivå: integration-lagret kastar sitt undantag, controllern fångar det och kastar ett nytt på rätt nivå för view.

### Task 2 — Observer-mönstret

`RepairOrder` är subject och notifierar alla registrerade observatörer vid varje tillståndsändring.

Två implementationer av `Observer`-interfacet:

- **`RepairOrderView`** — skriver uppdateringar till `System.out`
- **`RepairOrderLogger`** — skriver uppdateringar till `repairorder-log.txt`

---

## Projektstruktur

```
src/main/java/se/kth/iv1350/bikeshop/
├── startup/        Main.java — startar applikationen
├── view/           View, RepairOrderView, RepairOrderLogger
├── controller/     Controller, PhoneNrNotFoundException
├── model/          RepairOrder, DiagnosticReport, Observer
├── integration/    CustomerRegistry, BikeRegistry, RepairOrderRegistry,
│                   Printer, RegistryCreator,
│                   UnknownPhoneNrException, DatabaseFailureException
├── dto/            CustomerDTO, BikeDTO, RepairOrderDTO,
│                   RepairTaskDTO, DiagnosticReportDTO
└── util/           Logger, FileLogger, ConsoleLogger

src/test/java/se/kth/iv1350/bikeshop/
├── controller/     PhoneNrNotFoundExceptionTest
└── integration/    CustomerRegistryTest, BikeRegistryTest
```

---

## Köra programmet

```powershell
cd bikeshop
mvn compile exec:java '-Dexec.mainClass=se.kth.iv1350.bikeshop.startup.Main'
```

### Testa undantagen manuellt

Öppna `View.java` och byt telefonnummer:

| Nummer | Resultat |
|---|---|
| `0701234567` | Normalt flöde — Anna Svensson hittas |
| `0000000000` | `PhoneNrNotFoundException` — kund saknas |
| `8888888888` | `DatabaseFailureException` — simulerat databasfel |

---

## Köra tester

```powershell
cd bikeshop
mvn test
```

### Testöversikt

| Testklass | Tester | Vad testas |
|---|---|---|
| `CustomerRegistryTest` | 7 | Hitta kund, rätt data, `UnknownPhoneNrException`, `DatabaseFailureException` |
| `PhoneNrNotFoundExceptionTest` | 4 | Lyckat sökning, misslyckat sökning, rätt felmeddelande |
| `BikeRegistryTest` | 1 | Hitta cykel på korrekt telefonnummer |

**Totalt: 12 tester — alla passerar.**

---

## Krav

- Java 17
- Maven 3.x
