# آزمایش پنجم
مهرانه نجفی (۹۷۱۰۴۷۰۷)، رستا روغنی(۹۷۱۰۵۹۶۳) 

**شرح آزمایش**

در پیاده‌سازی تمامی الگوها به این صورت عمل کردیم که تست‌های مربوط را طراحی کردیم و با اجرای آن‌ها خطاهای کامپایل و زمان اجرا را پیدا کردیم و برطرف کردیم تا تمامی تست‌ها پاس شوند.

-*پیاده‌سازی الگوی Abstarct Factory*

کدهای این بخش همراه با تست‌شان در فولدر AbstractFactory قرار گرفته است.
سناریوی این بخش را به ترتیب زیر پیاده‌ می‌کنیم:

۱- تعریف اینترفیس AbstractTree و AbstactFlower

<img width="681" alt="Screen Shot 1401-09-17 at 20 13 16" src="https://user-images.githubusercontent.com/45355352/206511934-e7205a17-a433-479b-99c1-ea472b3886f5.png">
<img width="681" alt="Screen Shot 1401-09-17 at 20 13 12" src="https://user-images.githubusercontent.com/45355352/206511947-199b4547-e7f0-45fc-81ac-7444c14e72d1.png">

۲- تعریف کلاس‌های Chenar و Azalea (درختان ایرانی و ژاپنی) و کلاس‌های Khatmi و Sakura (گل‌های ایرانی و ژاپنی) که اینترفیس‌های قبلی را پیاده‌سازی می‌کنند (بخاطر شباهت کلاس‌ها تنها عکس یکی از هر دسته قرار داده‌شده‌است)  

<img width="681" alt="Screen Shot 1401-09-18 at 22 42 11" src="https://user-images.githubusercontent.com/45355352/206779651-f813548f-972a-443d-a0f8-6ad84e1141bb.png">
<img width="681" alt="Screen Shot 1401-09-18 at 22 42 18" src="https://user-images.githubusercontent.com/45355352/206779667-f70f22f7-a88f-4057-a5df-40f02c2d4035.png">

۳- تعریف اینترفیس AbstractGardenCreator

<img width="681" alt="Screen Shot 1401-09-17 at 20 32 52" src="https://user-images.githubusercontent.com/45355352/206549240-22b2909f-4b87-422c-9ebc-0b27145f2705.png">

۴- تعریف کلاس‌های iranianGardenCreator و JapaneseGardenCreator

<img width="681" alt="Screen Shot 1401-09-17 at 23 04 08" src="https://user-images.githubusercontent.com/45355352/206550519-fd5cf77e-ef74-4026-b74d-fa10ed517180.png">
<img width="681" alt="Screen Shot 1401-09-17 at 23 04 11" src="https://user-images.githubusercontent.com/45355352/206550531-660cb172-6539-499a-b554-296c3465741a.png">

۵- تعریف کلاس client

<img width="681" alt="Screen Shot 1401-09-17 at 23 05 01" src="https://user-images.githubusercontent.com/45355352/206550689-cfa4cb05-a9e2-4619-bc17-2816b526fb96.png">

۶- تعریف کلاس demo برای امتحان کردن کارکرد درست کدها

<img width="681" alt="Screen Shot 1401-09-17 at 23 10 38" src="https://user-images.githubusercontent.com/45355352/206551761-d82e5206-623e-41f7-9183-0cdc90a3653c.png">


-*پیاده‌سازی الگوی Prototype*


کدهای این بخش همراه با تست‌شان در فولدر Prototype قرار گرفته است.
برای پیاده‌سازی این بخش از https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm کمک گرفتیم. سناریو به این صورت است که کاربر می‌خواهد سه نوع مختلف ماده (جامد، مایع و گاز) داشته باشد:

۱- تعریف کلاس Matter که اینترفیس Clonable را پیاده می‌کند چون می‌خواهیم که بعد از دفعه‌ی اول ساختن شی، باقی دفعات از کپی یا کلون آن استفاده کنیم.

<img width="681" alt="Screen Shot 1401-09-18 at 09 28 09" src="https://user-images.githubusercontent.com/45355352/206634674-7767eacd-124b-418b-a44f-d63093a7107b.png">

۲- پیاده‌سازی کلاس‌های جامد (Solid)، مایع(liquid) و گاز(gas) (به علت شباهت کدها تنها یکی را قرار دادیم)

<img width="681" alt="Screen Shot 1401-09-18 at 22 44 00" src="https://user-images.githubusercontent.com/45355352/206780436-87247581-09fb-4bb7-b133-70e5c32fe798.png">

۳- تعریف کلاس MatterStorage برای ذخیره کردن مواد

<img width="681" alt="Screen Shot 1401-09-18 at 09 39 08" src="https://user-images.githubusercontent.com/45355352/206636220-6d4bf3f3-1997-441f-ba85-529e6c616363.png">

۴- تعریف کلاس  demo برای امتحان کردن کارکرد درست کدها

<img width="681" alt="Screen Shot 1401-09-18 at 09 43 30" src="https://user-images.githubusercontent.com/45355352/206636905-6b73b866-03d9-4d92-b409-e0139668b700.png">

-*پیاده‌سازی الگوی Builder*


کدهای این بخش همراه با تست‌شان در فولدر Builder قرار گرفته است. برای این بخش سناریویی که ما درنظر گرفتیم این است که کاربر می‌خواهد دو نوع لباس مختلف (تی‌شرت و کت) تولید کند. با کمک از مثالی که در ویدئوی آموزشی حل شد، الگو را پیاده می‌کنیم:

۱- ساختن enum به نام ClothingType

<img width="681" alt="Screen Shot 1401-09-17 at 23 58 44" src="https://user-images.githubusercontent.com/45355352/206560993-40d3645c-fcbe-4833-91f8-10c0508731aa.png">


۲- ساختن اینترفیس Builder. این اینترفیس سه متد را دربرمی‌گیرد که به ترتیب برای مشخص کردن نوع لباس، رنگ لباس و سایز لباس به کار می‌روند.

<img width="681" alt="Screen Shot 1401-09-18 at 00 00 45" src="https://user-images.githubusercontent.com/45355352/206561326-39d73e70-1fbe-47e1-b294-20c6b356d49b.png">


۳- ساختن کلاس‌هایTshirtBuilder و CoatBuilder که هردو اینترفیس قبلی را پیاده‌سازی می‌کنند (به علت شباهت کدها تنها عکس یکی را قرار دادیم)

<img width="681" alt="Screen Shot 1401-09-18 at 00 06 21" src="https://user-images.githubusercontent.com/45355352/206562290-4e4dcb20-6cd3-4630-81c2-dbd13518ab41.png">

۴- تعریف کلاس‌های Tshirt و Coat

<img width="681" alt="Screen Shot 1401-09-18 at 00 11 01" src="https://user-images.githubusercontent.com/45355352/206563114-c990daa9-4543-4305-ab1b-466ada07a60c.png">

۵- تعریف کلاس Director

<img width="681" alt="Screen Shot 1401-09-18 at 00 14 57" src="https://user-images.githubusercontent.com/45355352/206563777-3ac6159f-c289-466e-8be2-7c964aaa5a50.png">

۶- تعریف کلاس Size

<img width="681" alt="Screen Shot 1401-09-18 at 00 15 29" src="https://user-images.githubusercontent.com/45355352/206563863-c354abe0-323a-4929-8433-ce8d89c1f8fd.png">

۷- تعریف کلاس Client برای امتحان کردن کارکرد درست کدها

<img width="681" alt="Screen Shot 1401-09-18 at 00 19 14" src="https://user-images.githubusercontent.com/45355352/206564611-d1d21f93-a0f0-44d4-b1f8-84482d2cf1dc.png">


**پرسش‌ها**

۱. در کتاب GoF سه دسته الگوی طراحی معرفی شده است. آنها را نام ببرید و در مورد هر دسته در حد دو
خط توضیح دهید.

<div dir="rtl">


الگوی طراحی creational: این الگو مکانیسم‌های مختلفی برای ساخت آبجکت‌ها ارائه می‌کند که انعطاف و قابلیت استفاده‌ی چندباره‌ی کد را بالا می‌برد. شامل ۵ الگوی طراحی با نام‌های singleton، factory، abstract factory، ‌Builder و Prototype می‌شود.

الگوی طراحی structural: این الگو یک نقشه از چگونگی ترکیب آبجکت‌ها و کلاس‌‌های مختلف برای شکل دادن به ساختاری بزرگتر که برای اهداف بزرگتری چیده می‌شود است. این الگو نشان می‌دهد قطعه‌های منحصر به فرد در سیستم می‌توانند به صورت انعطاف‌پذیر و تعمیم‌پذیر با یکدیگر ترکیب شوند.

الگوی طراحی behavioral: این الگو به تقسیم وظایف بین آبجکت‌ها و الگوریتم‌های مختلف می‌پردازد و در پی شناسایی الگوی ارتباطی مشترک بین آبجکت‌های مختلف شناسایی است. در چنین الگوهایی ارتباط بین آبجکت‌ها باید به گونه‌ای باشد که بتوانند به راحتی با یکدیگر صحبت کرده ولی در عین حال به صورت سست به هم متصل باشند (loosely coupled).
</div>


۲. دو الگوی استفاده شده در این آزمایش جزو کدام دسته هستند؟

الگوهای creational هستند زیرا به شکل‌های مختلف ساخت آبجکت‌ها می‌پردازند. 

۳. فرق اصلی پنج اصل SOLID با الگوهای طراحی مطرح شده در GoF چیست؟

فرق اصلی آن‌ها که از اسم‌شان هم مشخص است در این است که SOLID "اصول" طراحی هستند و GoF "الگوهای" طراحی. اصول طراحی یک سری اصول انتزاعی هستند که ما باید در حین طراحی کردن نرم‌افزار دنبال کنیم و به زبان برنامه‌نویسی یا پلتفرم و یا استیت‌شان بستگی ندارند. درمقابل الگوهای طراحی راه‌حل‌های مسئله هستند و درسطح پایین به ما می‌گویند که در هنگام برقراری یک سری شرایط مشخص استفاده از کدام الگو و پترن بهتر است و درمورد پیاده‌سازی صحبت می‌کنند. (این الگوها قبلا توسط دیگران به شکل تست و ارور بدست آمده‌اند و مربوط به مسائل تکرارشونده‌ی Object-oriented هستند.)

۴. الگوی طراحی Singleton کدام یک از اصول SOLID را نقض میکند؟

- این الگو اصل Single Responsibility را نقض می‌کند چون علاوه بر وظیفه‌ی نرمال کلاس (دلیلی که بخاطرش یک کلاس تعریف کردیم) ، مسئولیت ساخت instanceها و جلوگیری از ساخت کپی را هم به عهده دارد و بطور کلی کنترل life-cycle اش با خودش است.
- این الگو اصل Open-Closed را نقض می‌کند چراکه اولا کاربر تنها به یک نمونه‌ی concrete از کلاس دسترسی دارد و دوما ساخت instance هم در خود کلاس هندل می‌شود و درنتیجه اگر بخواهیم تغییری بدهیم باید آن را مستقیما در خود کلاس پیاده‌سازی کنیم که مخالف با این اصل است که کلاس‌ها باید قابل گسترش باشند اما اصلاح‌پذیر نه.
- این الگو اصل Dependency Inversion را نقض می‌کند چون کاربران به نمونه‌ی concrete از کلاس دسترسی دارند و از Abstraction استفاده نمی‌شود که درنتیجه کاربران درگیر جزییات و کار کردن با خود کلاس Singleton می‌شوند.     
