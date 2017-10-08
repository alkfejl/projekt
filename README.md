# Dokumentáció

## Beadandó feladat

Készítette:
* Kiss Gergő
* Árvay Balázs

### 1. Projektindító dokumentum

A projekt egy olyan oldalt hivatott előkészíteni és megvalósítani, ami platformot biztosít a zenekarok és a klubok számára, hogy kommunikáljanak, megtalálják egymást és tájékozódni tudjanak a lehetőségeikről. Emellett természetesen segít mindenkinek egy helyre gyűjteni a zenei eseményeket és így egy átlátható listát nyújtani arról, hogy mégis hol milyen koncertek lesznek. Természetesen a klubok és zenekarok mellett így egy új lehetőség a zenét kedvelők számára is, ugyanis böngészhetnek a különböző események között, megnézhetik, hogy kedvenc zenekarok hol lép fel legközelebb, vagy a hozzájuk legközelebb lévő klubban mikor és kik fognak játszani.

#### Funkcionális követelmények:
* Látogató:
	* Klubbok böngészése
	* Zenekarok böngészése
* Regisztrált látogató:
	* Klubok és zenekarok keresése esetleg stílus alapján?
	* Időintervallumra esemény keresés
	* Kedvencek (klub/zenekar)
* Klub-Admin
	* Klub adatlap létrehozása (max. 1 db)
	* Klub adatainak szerkesztése
	* Események létrehozása (pl.: mikor, ki lép fel)
* Zenekar-Admin
	* Zenekar adatlap létrehozása (max. 1 db)
	* Zenekar adatainak szerkesztése
	* Események létrehozása (pl.: hol, mikor lép fel)
* Admin
	* minden adathoz és funkcióhoz hozzáfér
		
#### Nem funkcionális követelmények:
* Felhasználóbarát, ergonomikus elrendezés különböző eszközökön is, kijelzőmérettől függetlenül.
* Gyors és biztonságos működés.
* Jelszavak biztonságos tárolása.
* Felhasználótípusnak megfelelő hozzáférési kör.

#### Szakterületi fogalomjegyzék
* Backline: A színpadon a zenekar mögött helyet foglaló erõsítők (gitárládák), valamint a dob alapjának számító dobtesteket jelenti.
* Backstage: Röviden öltöző. Ez az a szoba vagy terület, ahova csak a zenészek mehetnek be és ahol felkészülnek a koncert előtt, valamint pihennek a zenélés után.
* Biográfia: Egy szöveges leírás, mely a zenekar történetét foglalja magába. Általában egy bő, hosszú leírás, amiben minden fontosabb mérföldkőről, tagcseréről és koncertről szó esik.
* Diszkográfia: A zenekar eddig kiadott hanganyagait tartalmazza. Beletartozik a nagylemez, kislemez és az egymagában kiadott dal, az úgynevezett single is.
* Remaster: egy új "Master", amely többnyire a hangzás följavítására hivatott. Automatikusan megtörténik, ha analógból digitálisra változtatnak. A különbség azonban nem mindig észrevehetõ.
* Sampler: Olyan bejátszások, elektronikus/szimfonikus alapok, melyeket a dalok lejátszásak közben felhasznál a zenekar. Ennek elindítása történhet laptop, telefon és midi-billentyűzet segítségével is.

### 2. Adatbázis
![Adatbázis](adatbazis.jpg)
