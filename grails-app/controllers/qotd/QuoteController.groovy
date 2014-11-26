package qotd

import groovyx.net.http.HTTPBuilder
import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*

class QuoteController {

    def index() {
        def quote = [quoteAuthor:'Babatunde Olatunji', quoteText: 'We are what we repeatedly do. Excellence, then, is not an act, but a habit.']
        def http = new HTTPBuilder()

/*        http.request('http://api.forismatic.com/api/1.0/?method=getQuote&key=457653&format=json&lang=en', GET, JSON ) { req ->
            headers.Accept = 'application/json'
            response.success = { resp, json -> quote = json }
            response.'404' = { println 'Not found' }
        }*/

        [quote: quote]
    }


}
