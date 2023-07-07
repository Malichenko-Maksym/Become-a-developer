package com.test.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MainController {


    @GetMapping
    public String mainPage(){
        return "main";
    }

    @PostMapping("/submitText")
    @ResponseBody
    public char returnResult(@RequestBody  String  userText){
        String madeWord = "";
        for(String word : WordsFromText.get(userText)){

            try{
                char toAdd = FirstUniqChar.find(word).get();
                madeWord+=toAdd;
            }
            catch (Exception e){

            }
        }


        return  FirstUniqChar.find(madeWord).get();
    }
}
