;; Copyright (c) 2018-2019 Bastien Guerry <bastien.guerry@data.gouv.fr>

;; SPDX-License-Identifier: EPL-2.0
;; License-Filename: LICENSES/EPL-2.0.txt

(ns csv2html.config
  (:require [aero.core :as aero]))

(def config (aero/read-config "config.edn"))

(defn export-dir []
  (or (System/getenv "CSV2HTML_EXPORTDIR")
      (get-in config [:export-dir])))

(defn max-body []
  (if-let [max-body (System/getenv "CSV2HTML_MAXBODY")]
    (read-string max-body)
    (get-in config [:max-body])))

(defn port []
  (if-let [port (System/getenv "CSV2HTML_PORT")]
    (read-string port)
    (get-in config [:port])))
