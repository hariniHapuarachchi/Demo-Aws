package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/welcome", produces = MediaType.TEXT_HTML_VALUE)
    public String getTestPage() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n" +
                "<form>\n" +
                "    <div class=\"mb-3\">\n" +
                "        <label for=\"exampleInputEmail1\" class=\"form-label\">Email address</label>\n" +
                "        <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n" +
                "        <div id=\"emailHelp\" class=\"form-text\">We'll never share your email with anyone else.</div>\n" +
                "    </div>\n" +
                "    <div class=\"mb-3\">\n" +
                "        <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\n" +
                "        <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\n" +
                "    </div>\n" +
                "    <div class=\"mb-3 form-check\">\n" +
                "        <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n" +
                "        <label class=\"form-check-label\" for=\"exampleCheck1\">Check me out</label>\n" +
                "    </div>\n" +
                "    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
    }

    @GetMapping(value = "/home", produces = MediaType.TEXT_HTML_VALUE)
    public String loadHomePage() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n" +
                "<table class=\"table\">\n" +
                "  <thead>\n" +
                "    <tr>\n" +
                "      <th scope=\"col\">#</th>\n" +
                "      <th scope=\"col\">First</th>\n" +
                "      <th scope=\"col\">Last</th>\n" +
                "      <th scope=\"col\">Handle</th>\n" +
                "    </tr>\n" +
                "  </thead>\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <th scope=\"row\">1</th>\n" +
                "      <td>Mark</td>\n" +
                "      <td>Otto</td>\n" +
                "      <td>@mdo</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <th scope=\"row\">2</th>\n" +
                "      <td>Jacob</td>\n" +
                "      <td>Thornton</td>\n" +
                "      <td>@fat</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <th scope=\"row\">3</th>\n" +
                "      <td colspan=\"2\">Larry the Bird</td>\n" +
                "      <td>@twitter</td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>" +
                "</body>\n" +
                "</html>";
    }
}
