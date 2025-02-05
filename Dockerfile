# Copyright (c) 2018-2021 Bastien Guerry <bastien.guerry@data.gouv.fr>

# SPDX-License-Identifier: EPL-2.0
# License-Filename: LICENSES/EPL-2.0.txt

FROM java:8-alpine

ADD target/csv2html-0.2.1-standalone.jar /csv2html/csv2html-0.2.1-standalone.jar
ADD config.edn config.edn

ENV CSV2HTML_EXPORTDIR="/exports/" CSV2HTML_PORT="4321" CSV2HTML_MAXBODY="100000000"

RUN mkdir ${CSV2HTML_EXPORTDIR}

EXPOSE ${CSV2HTML_PORT}

CMD ["java", "-jar", "/csv2html/csv2html-0.2.1-standalone.jar"]
