package service.impl;

import org.springframework.stereotype.Service;
import service.Dictionary;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryImpl implements Dictionary {
    static Map<String, String> dic = new HashMap<>();
    static {
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
    }
    @Override
    public String translate(String word) {
        String result=dic.get(word);
        return result;
    }
}
