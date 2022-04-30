<?php
  echo "reload the page<br>";
    $itm=60*60*24*60+time();
    #create cookie
    setcookie('last_visit',date("G:i s -m/d/y"),$itm);
    #check if cookie exists
    if(isset($_COOKIE['last_visit'])) {
        $visit=$_COOKIE['last_visit'];
        echo "Your last visit was- " .$visit;
    }
    else {
        #no cookies
        echo "You have some stale cookies!" ;
    }
 ?>