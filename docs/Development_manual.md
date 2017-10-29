# Þróunarskýrsla
![Mynd fannst ekki](http://www.ru.is/media/HR_logo_vinstri_hires.jpg "RU logo")

## Inngangur
Tilgangur þessa skýrslu er að upplýsa og auðvelda aðkomu annarra meðlima að  verkefninu. Skýrslan mun greina frá hvað þarf að vera að vera til staðar og uppfært út frá sjónarhorni þróunarteymis, hvernig á að setja upp forritið og hvernig á að meðhöndla kóða sem fyrir er. 
### Umverfi og forrit
Til að opna leikinn án vandræða á hreinni vél þarf að hafa sett upp:
- Git
- Gradle
- Java Development Kit
 
Það sem meðlimir í þróunarteymi þurfa hafa setja upp og kynna sér aukalega er
- Heroku
- Travis
- Javadoc
- Spark 
- Velocity

### Git
Notast er við Git við útgáfustjórnun(e. version control) í verkefninu. Til þess að geta opnað okkar TicTacToe skal afrita(e. clone) [repository-ið](https://github.com/orgs/A-lidid/dashboard). Til þess að geta opnað það, þarf að vera með aðgang inn á Git. Til þess að setja upp aðgang þarf að fara inn á [Git](https://github.com/)

Útgáfustjórn leyfir notendum að ná í forritið á sinni eigin tölvu, þar getur notandinn búið til branch og getur breytt og þróað forritið þar án þess að breyta á master. Þegar breytingar sem gerðar hafa verið á local branch og hægt er að keyra forritið er hægt að committa breytingunum yfir á master. Gott er að venja sig á að gera pull request áður en það er committað til þess að ná í allar breytingar sem gætu hafa verið gerðar.   

### Java 
Mikilvægt er að vera með nýjustu útgáfu af Java Development Kit. Hana er að finna á [Oracle]( http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). Fyrir windows notendur er mikilvægt að bæta við java path, en hvernig það er gert er hægt að skoða [hér](https://www.java.com/en/download/help/path.xml). 

#### Gradle
Við leikinn er notast við Gradle þegar verið er að builda. Til þess að setja það upp þarf að fara eftir eftir þeim [skrefum](https://gradle.org/install/), en þau eru mismunandi eftir því hvernig hugbúnað tölvan notar. Athuga að hér þarf að hafa sett upp java.

#### Travis
Meðlimir þurfa að vera með aðgang inn á Travis. Til þess að gerast meðlimur er farið inn á [Travis](https://travis-ci.org/). Þar geta meðlimir skráð sig inn með github. Travis framkvæmir einingaprófanir sem deployar það á prófunarvefhýsingu Horoku, ef að það virkar þá deployar það inn á vefhýsingu Horoku. Bæði ef að upp kom villa, eða ef þetta keyrði villulaust verður sent tilkynning inn á [Slack](#Slack)

#### Heroku
Heroku sér um að deploya og hýsa appið. Til að fá aðgang þarf að fara inn á [Heroku](https://dashboard.heroku.com/apps) og búa sér til aðgang. Meðlimir þurfa einnig að setja upp [Heroku toolbelt](https://devcenter.heroku.com/articles/heroku-cli) og skrá sig inn með aðgangi Heroku.  

### Spark
Mikilvægt er að meðlimir kynna sér skjölunina á [Spark](http://sparkjava.com/documentation#getting-started). Við spark skjölun er stuðst við möppustrúktur [Velocity](#velocity).

### Velocity
Velocity talar beint við spark og er hægt að kynna sér það [nánar](https://github.com/perwendel/spark-template-engines/tree/master/spark-template-velocity)

### Javadoc 
Þróunarteymi þarf að vera kunnugt um hvernig java documentation style virkar. Ef að meðlimir þurfa að kynna sér það nánar er hægt að gera [það](http://www.oracle.com/technetwork/articles/java/index-137868.html).

### Selenium
Til þess að setja upp Selenium prófanir þarf að setja upp Webdriver, fyrir þetta app var notað [chromedriver](https://sites.google.com/a/chromium.org/chromedriver/). Til þess að gefa skelini þarf að fara eftir þessum [leiðbeiningum](https://sites.google.com/a/chromium.org/chromedriver/getting-started).

### Slack
Meðlimir fá sent boð um aðgang að Slack sem sér um að tilkynna hvort að build hafi virkað og deployast að fullu, en einnig ef eitthvað fór úrskeiðis.

### Almennar reglur
Meðlimir í teymi skulu kynna sér kóðareglur sem finna má í hönnunarskýrslunni og fara eftir þeim í öllum tilvikum.
