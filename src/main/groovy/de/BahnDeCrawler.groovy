import geb.Browser


/**
 * This is an example geb file for www.bahn.de
 *
 * YOu have to fill the following parameter
 *
 */

def departure = "Bern"
def destination = "Berlin"
def departureDate = "17.04.2015"
def departureTime = "19:36"

browser = new Browser()
Browser.drive {

    browser.go "http://www.bahn.de"
    $("#qf-departure-point") << departure
    $("#qf-destination-point") << destination
    $("#qf-departure-date").value(departureDate)
    $("#qf-time").value(departureTime)

    $("form").find("button", name: "qf.bahn.button.suchen").click()


    //quit()
}

// the duckduckgo website has a much cleaner structure than google
// that makes it a better choice for demonstrating browser automation

