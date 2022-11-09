import android.content.Context
import android.location.Location
import android.location.LocationManager
import androidx.core.content.ContextCompat.getSystemService
import com.example.covid.ResultSearchKeyword
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query





interface KakaoAPI {
    @GET("v2/local/search/keyword.json?sort=accuracy")    // Keyword.json의 정보를 받아옴
//  @GET("v2/local/search/keyword.json?query=%s&y=%s&x=%s&radius=10000&x=35.968500&y=+126.957500&radius=5000&query=%EC%A0%84%EB%B6%81+%EC%9D%B5%EC%82%B0%EC%8B%9C")
//@GET("v2/local/search/keyword.json?sort=distance&query=%EC%BD%94%EB%A1%9C%EB%82%9819+%EC%A0%84%EB%B6%81&x=35.968500&y=126.957500&radius=20000")//익산시 내 20km 선별진료소 찾기
//@GET("v2/local/search/keyword.json?sort=accuracy&query=%EC%BD%94%EB%A1%9C%EB%82%9819+%EC%A0%84%EB%B6%81+%EC%9D%B5%EC%82%B0&x=35.968500&y=126.957500&radius=10000")

//@GET("v2/local/search/keyword.json?sort=accuracy&x=uLatitude&y=uLongitude&radius=10000")
//@GET("v2/local/search/keyword.json?sort=distance&category_group_code=HP8&x=35.968500&y=+126.957500&radius=5000&query=%EC%A0%84%EB%B6%81+%EC%9D%B5%EC%82%B0%EC%8B%9C")
//35.968500 , 126.957500 // 프라임관
//37.5545 , 126.971 //서울역



    fun getSearchKeyword(
        @Header("Authorization") key: String,     // 카카오 API 인증키 [필수]
        @Query("query") query: String,            // 검색을 원하는 질의어 [필수]
        @Query("x") yLongitude: String,
        @Query("y") yLatitude: String,
        @Query("radius") radius: Int,
        @Query("page") page: Int,                  // 결과 페이지 번호

    ): Call<ResultSearchKeyword>    // 받아온 정보가 ResultSearchKeyword 클래스의 구조로 담김
}