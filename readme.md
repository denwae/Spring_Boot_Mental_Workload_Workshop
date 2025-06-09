# Spring Boot Workshop

Das ist der erste Workshop für die Auswertung des Mental Workload auf die Entwickler bei der Entwicklung mit und ohne Spring Modulith. In diesem Workshop wird der unten beschriebene Use Case mit Spring Boot implementiert.

## Use Case

Für eine Musikdatenbank, die von den Benutzern gepflegt wird, wird eine Anwendung entwickelt. In einem ersten Prototyp muss das Erstellen, Suchen und Löschen von Songs, Alben und Künstlern implementiert werden. Da die Datenbank von den Benutzern kollaborativ aufgebaut wird und möglichst viele Informationen enthalten soll, können die Songs, Alben und Künstler unvollständig sein. Die einzig notwendigen Daten zur Erstellung sind der jeweilige Name.

Beim Erstellen von Künstlern muss ein Name angegeben werden. Optional kann noch das Gründungsjahr, der aktuelle Status und eine Biographie angegeben werden.

Bei der Erstellung von Songs muss der Name angegeben werden und es können zusätzlich die Dauer und die Künstler angegeben werden. Es dürfen nur bereits erstellte Künstler angegeben werden.

Beim Erstellen von Alben muss der Name angegeben werden. Es kann zudem das Veröffentlichungsjahr und Songs hinzugefügt werden. Es dürfen nur Songs angegeben werden, welche bereits in der Anwendung erstellt wurden. Derselbe Song kann auf unterschiedlichen Alben erscheinen.

Beim Abfragen der Daten kommen weitere Daten hinzu. Songs müssen zusätzlich mit ihren Alben ausgegeben werden. Alben benötigen, alle involvierten Künstler und die Gesamtlänge des Albums. Die Länge setzt sich aus der Länge der Songs zusammen und die Künstler aus allen Künstlern, welche an einem Song mitgewirkt haben. Künstler werden mit allen ihren Alben geladen.

Beim Löschen eines Songs, Albums oder Künstlers dürfen keine weiteren Daten gelöscht werden. Zum Beispiel darf, wenn ein Song gelöscht wird, nicht die Künstler, welche den Song gespielt haben, oder die Alben, auf dem der Song vorkommt, gelöscht werden.

## Aufgabe

Die drei APIs `albums.AlbumAPI`, `artists.ArtistAPI` und `songs.SongAPI` müssen implementiert werden. Um sicherzustellen, dass alle APIs korrekt implementiert wurden, müssen alle Tests erfolgreich durchlaufen.