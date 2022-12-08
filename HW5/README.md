# آزمایش پنجم
مهرانه نجفی (۹۷۱۰۴۷۰۷)، رستا روغنی(۹۷۱۰۵۹۶۳) 

**شرح آزمایش**

-پیاده‌سازی الگوی Abstarct Factory

سناریوی این بخش را به ترتیب زیر پیاده‌ می‌کنیم:

۱- تعریف اینترفیس AbstractTree و AbstactFlower

<img width="681" alt="Screen Shot 1401-09-17 at 20 13 16" src="https://user-images.githubusercontent.com/45355352/206511934-e7205a17-a433-479b-99c1-ea472b3886f5.png">
<img width="681" alt="Screen Shot 1401-09-17 at 20 13 12" src="https://user-images.githubusercontent.com/45355352/206511947-199b4547-e7f0-45fc-81ac-7444c14e72d1.png">

۲- تعریف کلاس‌های Chenar و Azalea (درختان ایرانی و ژاپنی) و کلاس‌های Khatmi و Sakura (گل‌های ایرانی و ژاپنی) که اینترفیس‌های قبلی را پیاده‌سازی می‌کنند (بخاطر شباهت کلاس‌ها تنها عکس یکی از هر دسته قرار داده‌شده‌است)  

<img width="681" alt="Screen Shot 1401-09-17 at 20 12 11" src="https://user-images.githubusercontent.com/45355352/206511738-9de586de-beb6-4b94-af93-63e33b38fadd.png">
<img width="681" alt="Screen Shot 1401-09-17 at 20 12 37" src="https://user-images.githubusercontent.com/45355352/206511772-19da0962-5f18-4513-bc41-0f72378f1c86.png">


۳- تعریف اینترفیس AbstractGardenCreator

<img width="681" alt="Screen Shot 1401-09-17 at 20 32 52" src="https://user-images.githubusercontent.com/45355352/206549240-22b2909f-4b87-422c-9ebc-0b27145f2705.png">

۴- تعریف کلاس‌های iranianGardenCreator و JapaneseGardenCreator

<img width="681" alt="Screen Shot 1401-09-17 at 23 04 08" src="https://user-images.githubusercontent.com/45355352/206550519-fd5cf77e-ef74-4026-b74d-fa10ed517180.png">
<img width="681" alt="Screen Shot 1401-09-17 at 23 04 11" src="https://user-images.githubusercontent.com/45355352/206550531-660cb172-6539-499a-b554-296c3465741a.png">

۵- تعریف کلاس client

<img width="681" alt="Screen Shot 1401-09-17 at 23 05 01" src="https://user-images.githubusercontent.com/45355352/206550689-cfa4cb05-a9e2-4619-bc17-2816b526fb96.png">

۶- تعریف کلاس demo برای امتحان کردن کارکرد درست کدها

<img width="681" alt="Screen Shot 1401-09-17 at 23 10 38" src="https://user-images.githubusercontent.com/45355352/206551761-d82e5206-623e-41f7-9183-0cdc90a3653c.png">


-پیاده‌سازی الگوی Prototype

-پیاده‌سازی الگوی Builder

برای این بخش سناریویی که ما درنظر گرفتیم این است که کاربر می‌خواهد دو نوع لباس مختلف (تی‌شرت و کت) تولید کند. با کمک از مثالی که در ویدئوی آموزشی حل شد، الگو را پیاده می‌کنیم:

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

۲. دو الگوی استفاده شده در این آزمایش جزو کدام دسته هستند؟

۳. فرق اصلی پنج اصل SOLID با الگوهای طراحی مطرح شده در GoF چیست؟

۴. الگوی طراحی Singleton کدام یک از اصول SOLID را نقض میکند؟
