package day57;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

public class MVC {
}

// ---------- MVC1 ---------- //
class ViewController{ }
class Mvc1Dao{ }


// ---------- MVC2 ---------- //
class Mvc2View{ }
class Mvc2Controller{ }
class Mvc2Dao{ }


// ---------- MVC2 3티어 ---------- //
// 스프링은 무조건 이걸 사용하는걸 권장함.
// view : resource 안에 (html/css/js/react) 존재
class Mvc2tire3Controller{ }
class Mvc2tire3Service{ }
class Mvc2tire3Dao{ }


// ---------- Spring MVC2_3tire ---------- //
@RestController
class Controller{ }
@Service
class MvcService{ }
@Component
class MvcDao{ }
