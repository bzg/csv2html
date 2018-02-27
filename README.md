

# What it does?

csv2html converts plain csv to datatables HTML pages.

The resulting HTML page can be browsed on `export/[csv-filename].html`.


# Run

    ~$ git clone https://github.com/entrepreneur-interet-general/csv2html
    ~$ cd csv2html/
    ~$ lein run

Then open <https://localhost:8080>.


# Install


## Deploying the .jar

    ~$ git clone https://github.com/entrepreneur-interet-general/csv2html
    ~$ cd csv2html/
    ~$ lein uberjar

Then deploy `target/uberjar/csv2html.jar` anywhere you want with
`java -jar csv2html.jar`.


# License

`csv2html` is licensed under the [Eclipse Public License 1.0](http://www.eclipse.org/legal/epl-v10.html), the
same as Clojure.

