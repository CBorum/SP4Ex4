/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Borum
 */
public class quote extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String[] quotes = {
            "The generation of random numbers is too important to be left to chance.\n"
            + "—Robert R. Coveyou",
            "Quantum mechanics is certainly imposing. But an inner voice tells me that it is not yet the real thing. The theory says a lot, but does not really bring us any closer to the secret of the ‘old one.’ I, at any rate, am convinced that He does not throw dice.\n"
            + "—Albert Einstein",
            "Random numbers should not be generated with a method chosen at random.\n"
            + "—Donald Knuth",
            "Any one who considers arithmetical methods of producing random digits is, of course, in a state of sin.\n"
            + "—John von Neumann",
            "Creativity is the ability to introduce order into the randomness of nature.\n"
            + "—Eric Hoffer",
            "The world is governed by chance. Randomness stalks us every day of our lives.\n"
            + "—Paul Auster",
            "We all experience many freakish and unexpected events - you have to be open to suffering a little. The philosopher Schopenhauer talked about how out of the randomness, there is an apparent intention in the fate of an individual that can be glimpsed later on. When you are an old guy, you can look back, and maybe this rambling life has some through-line. Others can see it better sometimes. But when you glimpse it yourself, you see it more clearly than anyone.\n"
            + "—Viggo Mortensen",
            "So much of life, it seems to me, is determined by pure randomness.\n"
            + "—Sidney Poitier",
            "Oh, many a shaft at random sent\n"
            + "Finds mark the archer little meant!\n"
            + "And many a word at random spoken\n"
            + "May soothe, or wound, a heart that's broken!\n"
            + "—Sir Walter Scott, Lord of the Isles",
            "To dare every day to be irreverent and bold. To dare to preserve the randomness of mind which in children produces strange and wonderful new thoughts and forms. To continually scramble the familiar and bring the old into new juxtaposition.\n"
            + "—Gordon Webber"
        };
        Random r = new Random();
        int rand = r.nextInt(quotes.length);
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println(quotes[rand]);
        } finally {
            out.close();
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
