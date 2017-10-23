# Design report
![Mynd fannst ekki](http://www.ru.is/media/HR_logo_vinstri_hires.jpg "RU logo")
## Inngangur
### Um Tic Tac Toe
Tic Tac Toe er einfaldur leikur þar sem tveir leikmenn skiptast á við að setja merki sit í 3x3 fylki og til þess að vinna þarf leikmaður að vera með þrjú í röð af sínu merki, lárétt, lóðrétt eða á skálínu. Leikurinn verður með einföldu viðmóti þar sem notendur skiptast á að smella takka til þess að setja sitt tákn á borðið og uppfærist staða borðsins jafnóðum. Ekki verður boðið upp á að spila á móti tölvu í fyrstu útgáfu en væri það góð viðbót ef tími gefst.
### Um útfærslu
Treymið ætlar að útfæra TicTacToe sem vef sem verður hýstur hjá [Heroku](https://www.heroku.com) sem býður upp á ókeypis vefhýsingu fyrir smáforrit skrifuðum í hinum ýmsu málum. Leikurinn sjálfur verður skrifaður í [Java](https://www.java.com/en/). Teymið mun styðjast við [Gradle Build Tool](https://gradle.org/) til þess að sjá um viðhald dependency-a, og [Travis](https://travis-ci.org/) fyrir samfellda samþættingu og styðjast við [Selenium](http://www.seleniumhq.org/) til þess að keyra prófanir á vefumhverfi.
## Rit
### Klasarit
Klasaritið sýnir þá lagskiptingu sem teymið telur að verkefnið þurfi. Controllerinn TicTacToeController talar við service klasann sem framkvæmir þær aðgerðir að setja tákn á réttan stað í TicTacToe klasanum og lætur viðmótið vita hvort það hafi tekist eður ei.
![Mynd Fannst Ekki](https://github.com/A-lidid/TicTacToe/docs/images/class_diagram.png "Klasarit")
## Reglur
### Almennar kóða reglur
1. Allur kóði og athugasemdir skulu vera skrifuð á ensku.
2. Athugasemdir skulu vera fyrir ofan það sem verið er að gera athugasemd við.
3. Ef fall er farið að gera óþarflega mikið skal skipta því upp í smærri einingar.
### Nafnagiftir
1. Skýra skal breytur skýrum og lýsanlegum nöfnum.
2. Ef þarf að nota skammstöfun skulu þær vera í hástöfum ef þær eru 3 er færri stafir, annars í lágstöfum.
### Java
1. Klasaheiti skulu nota PascalCase þar sem fyrsti stafurinn er hástafur og svo hástafur i byrjun hvers orðar sem kemur á eftir.
2. Breytuheiti skulu nota camelCase þar sem fyrsti stafur er lágstafur og svo hástafur í byrjun hvers orðs.
3. Fastar skulu vera skilgreindir i öllum hástöfum.
4. Slaufusvigar skulu opnast í sömu línu og klasa, falla og lykkju yfirlýsingu.
### Github
1. Alveg bannað að pusha brotnum kóða á github.
2. Notast skal við greinar meðan verið er að þróa virkni.
3. Nota skal pull-request sem þarf að standast skoðun að minnsta kosti eins meðlims teymisins til þess að sameina í master greinina.
## Lokaorð
Teymið er spennt að byrja að útfæra virknina og reyna fá alla mismunandi hlutina til þess að tala saman.