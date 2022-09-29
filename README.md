# Mybatis-work
Mybatisを使用してREST APIとDatabaseを連携するレポジトリです。
MySQLの情報をCRUD処理を通じてlocalhostに反映させます。


- ## 出力結果
- ###CREATE処理
![image](https://user-images.githubusercontent.com/107293004/193078664-d0e4a663-187e-4a80-9e21-c131acaff71a.png)

- ###READ処理
![image](https://user-images.githubusercontent.com/107293004/191079402-837da683-b408-4422-89bd-d28de0b2690c.png)

- ###UPDATE処理
![image](https://user-images.githubusercontent.com/107293004/193078218-99eafc1d-f8d3-4728-abc3-fe15e3260bd1.png)

- ###DELETE処理



- ## Description
  パッケージを以下のように分けて、記述しています。

  - ### Controllerパッケージ
    ここにはREST APIに対応するコードを記述しています。
    
    Responseファイルは小川先生のコードを参考にしました。
    
  - ### Mapperパッケージ
    Databaseに対する処理についてのコードを記述しています。

  - ### Serviceパッケージ
    ControllerとMapperの間の業務処理に関するコードを記述しています。  
    
    パッケージの中はInterfaceとそれを実装するクラスで構成しています。

  - ### Entityパッケージ
    localhostに表示するデータの形を決めるコードを記述しています。
    
    今回は家計簿を想定して
      - id
      - 収入／支出の別
      - カテゴリ
      - 金額     
     から構成しています。
     
   - ### 環境     
     - OS：Windows１１
     - エディタ:IntelliJ
     - ターミナル：Git
