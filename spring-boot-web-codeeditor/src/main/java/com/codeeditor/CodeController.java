package com.codeeditor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

@Controller
@Slf4j
public class CodeController {

    @GetMapping("/")
    public String edit(Model model){
        model.addAttribute("value", getFile());
        model.addAttribute("language", "html");

        return "monaco";
    }

    public String getFile() {

        String code = "";

        try (FileInputStream input = new FileInputStream("///C:/file/path/TestCode.java")) {
            InputStreamReader reader = new InputStreamReader(input, "utf-8");
            BufferedReader in = new BufferedReader(reader);

            int ch;
            while ((ch = in.read()) != -1) {
                code += (char) ch;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return code;
    }

    public String getChangeFile(String lang) {

        String code = "";

        try (FileInputStream input = new FileInputStream("///C:/file/path/TestCode."+lang)) {
            InputStreamReader reader = new InputStreamReader(input, "utf-8");
            BufferedReader in = new BufferedReader(reader);

            int ch;
            while ((ch = in.read()) != -1) {
                code += (char) ch;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return code;
    }

    public void  setFile(String filename){
        File file = new File(""+filename);

    }
}
