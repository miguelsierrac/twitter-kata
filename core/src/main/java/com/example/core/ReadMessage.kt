import com.example.core.TimeLine
import com.example.core.TimeLineRepository

class ReadMessage(val timeLineRepository: TimeLineRepository) {

   fun execute(user: String): TimeLine {
      val timeLine = timeLineRepository.get(user)
       return timeLine!!
   }
}