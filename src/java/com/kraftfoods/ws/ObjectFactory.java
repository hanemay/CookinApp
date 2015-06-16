
package com.kraftfoods.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kraftfoods.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RecipeSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeSummariesResponse");
    private final static QName _GetRecipeCategoryResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "GetRecipeCategoryResponse");
    private final static QName _GetRecipeClassificationResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "GetRecipeClassificationResponse");
    private final static QName _GetRecipeSubCategoryResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "GetRecipeSubCategoryResponse");
    private final static QName _RecipeVideosResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeVideosResponse");
    private final static QName _ROTDSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "ROTDSummariesResponse");
    private final static QName _MemberRecipeDetailResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "MemberRecipeDetailResponse");
    private final static QName _RecipeDetailResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeDetailResponse");
    private final static QName _RatingsPagedResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RatingsPagedResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "LoginResponse");
    private final static QName _ForgotPasswordCallResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "ForgotPasswordCallResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "LogoutResponse");
    private final static QName _RecipeBoxResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeBoxResponse");
    private final static QName _StatusResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "StatusResponse");
    private final static QName _RecipeBoxRecipeSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeBoxRecipeSummariesResponse");
    private final static QName _RecipeInRecipeBoxResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeInRecipeBoxResponse");
    private final static QName _ShoppingListsResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "ShoppingListsResponse");
    private final static QName _ShoppingListResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "ShoppingListResponse");
    private final static QName _SortedShoppingListResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "SortedShoppingListResponse");
    private final static QName _EditShoppingListItemResponseNew_QNAME = new QName("http://www.kraftfoods.com/ws/", "EditShoppingListItemResponseNew");
    private final static QName _AddItemToShoppingListResponseNew_QNAME = new QName("http://www.kraftfoods.com/ws/", "AddItemToShoppingListResponseNew");
    private final static QName _RecipeBoxShoppingListResponses_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeBoxShoppingListResponses");
    private final static QName _RecipeBoxShoppingListResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeBoxShoppingListResponse");
    private final static QName _StoreSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "StoreSummariesResponse");
    private final static QName _CoremetricsResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "CoremetricsResponse");
    private final static QName _VideoRecipeSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "VideoRecipeSummariesResponse");
    private final static QName _DTSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "DTSummariesResponse");
    private final static QName _RecipeSubCategoryResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeSubCategoryResponse");
    private final static QName _PollDetailsResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "PollDetailsResponse");
    private final static QName _String_QNAME = new QName("http://www.kraftfoods.com/ws/", "string");
    private final static QName _AnyType_QNAME = new QName("http://www.kraftfoods.com/ws/", "anyType");
    private final static QName _SiteUserAcctPointsLeftResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "SiteUserAcctPointsLeftResponse");
    private final static QName _RecipeSummaryDetailsResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeSummaryDetailsResponse");
    private final static QName _RecipeDetailResponses_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeDetailResponses");
    private final static QName _OptinSummaryResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "OptinSummaryResponse");
    private final static QName _UpadteUserAnswerResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "UpadteUserAnswerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kraftfoods.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExecuteRecipeSearch }
     * 
     * @return 
     */
    public ExecuteRecipeSearch createExecuteRecipeSearch() {
        return new ExecuteRecipeSearch();
    }

    /**
     * Create an instance of {@link ExecuteRecipeSearchResponse }
     * 
     * @return 
     */
    public ExecuteRecipeSearchResponse createExecuteRecipeSearchResponse() {
        return new ExecuteRecipeSearchResponse();
    }

    /**
     * Create an instance of {@link RecipeSummariesResponse }
     * 
     * @return 
     */
    public RecipeSummariesResponse createRecipeSummariesResponse() {
        return new RecipeSummariesResponse();
    }

    /**
     * Create an instance of {@link GetRecipesBySubcategoryWithExtraInformation }
     * 
     * @return 
     */
    public GetRecipesBySubcategoryWithExtraInformation createGetRecipesBySubcategoryWithExtraInformation() {
        return new GetRecipesBySubcategoryWithExtraInformation();
    }

    /**
     * Create an instance of {@link GetRecipesBySubcategoryWithExtraInformationResponse }
     * 
     * @return 
     */
    public GetRecipesBySubcategoryWithExtraInformationResponse createGetRecipesBySubcategoryWithExtraInformationResponse() {
        return new GetRecipesBySubcategoryWithExtraInformationResponse();
    }

    /**
     * Create an instance of {@link GetRecipesBySubcategory }
     * 
     * @return 
     */
    public GetRecipesBySubcategory createGetRecipesBySubcategory() {
        return new GetRecipesBySubcategory();
    }

    /**
     * Create an instance of {@link GetRecipesBySubcategoryResponse }
     * 
     * @return 
     */
    public GetRecipesBySubcategoryResponse createGetRecipesBySubcategoryResponse() {
        return new GetRecipesBySubcategoryResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByCategory }
     * 
     * @return 
     */
    public GetRecipesByCategory createGetRecipesByCategory() {
        return new GetRecipesByCategory();
    }

    /**
     * Create an instance of {@link GetRecipesByCategoryResponse }
     * 
     * @return 
     */
    public GetRecipesByCategoryResponse createGetRecipesByCategoryResponse() {
        return new GetRecipesByCategoryResponse();
    }

    /**
     * Create an instance of {@link GetRecipeCategories }
     * 
     * @return 
     */
    public GetRecipeCategories createGetRecipeCategories() {
        return new GetRecipeCategories();
    }

    /**
     * Create an instance of {@link GetRecipeCategoriesResponse }
     * 
     * @return 
     */
    public GetRecipeCategoriesResponse createGetRecipeCategoriesResponse() {
        return new GetRecipeCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetRecipeCategoryResponse }
     * 
     * @return 
     */
    public GetRecipeCategoryResponse createGetRecipeCategoryResponse() {
        return new GetRecipeCategoryResponse();
    }

    /**
     * Create an instance of {@link GetRecipeClassifications }
     * 
     * @return 
     */
    public GetRecipeClassifications createGetRecipeClassifications() {
        return new GetRecipeClassifications();
    }

    /**
     * Create an instance of {@link GetRecipeClassificationsResponse }
     * 
     * @return 
     */
    public GetRecipeClassificationsResponse createGetRecipeClassificationsResponse() {
        return new GetRecipeClassificationsResponse();
    }

    /**
     * Create an instance of {@link GetRecipeClassificationResponse }
     * 
     * @return 
     */
    public GetRecipeClassificationResponse createGetRecipeClassificationResponse() {
        return new GetRecipeClassificationResponse();
    }

    /**
     * Create an instance of {@link GetRecipeSubCategories }
     * 
     * @return 
     */
    public GetRecipeSubCategories createGetRecipeSubCategories() {
        return new GetRecipeSubCategories();
    }

    /**
     * Create an instance of {@link GetRecipeSubCategoriesResponse }
     * 
     * @return 
     */
    public GetRecipeSubCategoriesResponse createGetRecipeSubCategoriesResponse() {
        return new GetRecipeSubCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetRecipeSubCategoryResponse }
     * 
     * @return 
     */
    public GetRecipeSubCategoryResponse createGetRecipeSubCategoryResponse() {
        return new GetRecipeSubCategoryResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywords }
     * 
     * @return 
     */
    public GetRecipesByKeywords createGetRecipesByKeywords() {
        return new GetRecipesByKeywords();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywordsResponse }
     * 
     * @return 
     */
    public GetRecipesByKeywordsResponse createGetRecipesByKeywordsResponse() {
        return new GetRecipesByKeywordsResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByIngredients }
     * 
     * @return 
     */
    public GetRecipesByIngredients createGetRecipesByIngredients() {
        return new GetRecipesByIngredients();
    }

    /**
     * Create an instance of {@link GetRecipesByIngredientsResponse }
     * 
     * @return 
     */
    public GetRecipesByIngredientsResponse createGetRecipesByIngredientsResponse() {
        return new GetRecipesByIngredientsResponse();
    }

    /**
     * Create an instance of {@link GetRecipeVideos }
     * 
     * @return 
     */
    public GetRecipeVideos createGetRecipeVideos() {
        return new GetRecipeVideos();
    }

    /**
     * Create an instance of {@link GetRecipeVideosResponse }
     * 
     * @return 
     */
    public GetRecipeVideosResponse createGetRecipeVideosResponse() {
        return new GetRecipeVideosResponse();
    }

    /**
     * Create an instance of {@link RecipeVideosResponse }
     * 
     * @return 
     */
    public RecipeVideosResponse createRecipeVideosResponse() {
        return new RecipeVideosResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywordsAndCategoryGroup }
     * 
     * @return 
     */
    public GetRecipesByKeywordsAndCategoryGroup createGetRecipesByKeywordsAndCategoryGroup() {
        return new GetRecipesByKeywordsAndCategoryGroup();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywordsAndCategoryGroupResponse }
     * 
     * @return 
     */
    public GetRecipesByKeywordsAndCategoryGroupResponse createGetRecipesByKeywordsAndCategoryGroupResponse() {
        return new GetRecipesByKeywordsAndCategoryGroupResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywordsAndSubcategory }
     * 
     * @return 
     */
    public GetRecipesByKeywordsAndSubcategory createGetRecipesByKeywordsAndSubcategory() {
        return new GetRecipesByKeywordsAndSubcategory();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywordsAndSubcategoryResponse }
     * 
     * @return 
     */
    public GetRecipesByKeywordsAndSubcategoryResponse createGetRecipesByKeywordsAndSubcategoryResponse() {
        return new GetRecipesByKeywordsAndSubcategoryResponse();
    }

    /**
     * Create an instance of {@link GetHealthyLivingRecipes }
     * 
     * @return 
     */
    public GetHealthyLivingRecipes createGetHealthyLivingRecipes() {
        return new GetHealthyLivingRecipes();
    }

    /**
     * Create an instance of {@link GetHealthyLivingRecipesResponse }
     * 
     * @return 
     */
    public GetHealthyLivingRecipesResponse createGetHealthyLivingRecipesResponse() {
        return new GetHealthyLivingRecipesResponse();
    }

    /**
     * Create an instance of {@link GetRecipesOfTheWeek }
     * 
     * @return 
     */
    public GetRecipesOfTheWeek createGetRecipesOfTheWeek() {
        return new GetRecipesOfTheWeek();
    }

    /**
     * Create an instance of {@link GetRecipesOfTheWeekResponse }
     * 
     * @return 
     */
    public GetRecipesOfTheWeekResponse createGetRecipesOfTheWeekResponse() {
        return new GetRecipesOfTheWeekResponse();
    }

    /**
     * Create an instance of {@link ROTDSummariesResponse }
     * 
     * @return 
     */
    public ROTDSummariesResponse createROTDSummariesResponse() {
        return new ROTDSummariesResponse();
    }

    /**
     * Create an instance of {@link GetRecipeOfTheDay }
     * 
     * @return 
     */
    public GetRecipeOfTheDay createGetRecipeOfTheDay() {
        return new GetRecipeOfTheDay();
    }

    /**
     * Create an instance of {@link GetRecipeOfTheDayResponse }
     * 
     * @return 
     */
    public GetRecipeOfTheDayResponse createGetRecipeOfTheDayResponse() {
        return new GetRecipeOfTheDayResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByRecipeIDs }
     * 
     * @return 
     */
    public GetRecipesByRecipeIDs createGetRecipesByRecipeIDs() {
        return new GetRecipesByRecipeIDs();
    }

    /**
     * Create an instance of {@link GetRecipesByRecipeIDsResponse }
     * 
     * @return 
     */
    public GetRecipesByRecipeIDsResponse createGetRecipesByRecipeIDsResponse() {
        return new GetRecipesByRecipeIDsResponse();
    }

    /**
     * Create an instance of {@link GetUserRecipeByUserRecipeID }
     * 
     * @return 
     */
    public GetUserRecipeByUserRecipeID createGetUserRecipeByUserRecipeID() {
        return new GetUserRecipeByUserRecipeID();
    }

    /**
     * Create an instance of {@link GetUserRecipeByUserRecipeIDResponse }
     * 
     * @return 
     */
    public GetUserRecipeByUserRecipeIDResponse createGetUserRecipeByUserRecipeIDResponse() {
        return new GetUserRecipeByUserRecipeIDResponse();
    }

    /**
     * Create an instance of {@link MemberRecipeDetailResponse }
     * 
     * @return 
     */
    public MemberRecipeDetailResponse createMemberRecipeDetailResponse() {
        return new MemberRecipeDetailResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByRecipeIDsWithExtraInformation }
     * 
     * @return 
     */
    public GetRecipesByRecipeIDsWithExtraInformation createGetRecipesByRecipeIDsWithExtraInformation() {
        return new GetRecipesByRecipeIDsWithExtraInformation();
    }

    /**
     * Create an instance of {@link GetRecipesByRecipeIDsWithExtraInformationResponse }
     * 
     * @return 
     */
    public GetRecipesByRecipeIDsWithExtraInformationResponse createGetRecipesByRecipeIDsWithExtraInformationResponse() {
        return new GetRecipesByRecipeIDsWithExtraInformationResponse();
    }

    /**
     * Create an instance of {@link GetRecipeByRecipeID }
     * 
     * @return 
     */
    public GetRecipeByRecipeID createGetRecipeByRecipeID() {
        return new GetRecipeByRecipeID();
    }

    /**
     * Create an instance of {@link GetRecipeByRecipeIDResponse }
     * 
     * @return 
     */
    public GetRecipeByRecipeIDResponse createGetRecipeByRecipeIDResponse() {
        return new GetRecipeByRecipeIDResponse();
    }

    /**
     * Create an instance of {@link RecipeDetailResponse }
     * 
     * @return 
     */
    public RecipeDetailResponse createRecipeDetailResponse() {
        return new RecipeDetailResponse();
    }

    /**
     * Create an instance of {@link GetRecipeByRecipeIDWithExtraInformation }
     * 
     * @return 
     */
    public GetRecipeByRecipeIDWithExtraInformation createGetRecipeByRecipeIDWithExtraInformation() {
        return new GetRecipeByRecipeIDWithExtraInformation();
    }

    /**
     * Create an instance of {@link GetRecipeByRecipeIDWithExtraInformationResponse }
     * 
     * @return 
     */
    public GetRecipeByRecipeIDWithExtraInformationResponse createGetRecipeByRecipeIDWithExtraInformationResponse() {
        return new GetRecipeByRecipeIDWithExtraInformationResponse();
    }

    /**
     * Create an instance of {@link GetRatingsPaged }
     * 
     * @return 
     */
    public GetRatingsPaged createGetRatingsPaged() {
        return new GetRatingsPaged();
    }

    /**
     * Create an instance of {@link GetRatingsPagedResponse }
     * 
     * @return 
     */
    public GetRatingsPagedResponse createGetRatingsPagedResponse() {
        return new GetRatingsPagedResponse();
    }

    /**
     * Create an instance of {@link RatingsPagedResponse }
     * 
     * @return 
     */
    public RatingsPagedResponse createRatingsPagedResponse() {
        return new RatingsPagedResponse();
    }

    /**
     * Create an instance of {@link GetRatingsPagedByRatingType }
     * 
     * @return 
     */
    public GetRatingsPagedByRatingType createGetRatingsPagedByRatingType() {
        return new GetRatingsPagedByRatingType();
    }

    /**
     * Create an instance of {@link GetRatingsPagedByRatingTypeResponse }
     * 
     * @return 
     */
    public GetRatingsPagedByRatingTypeResponse createGetRatingsPagedByRatingTypeResponse() {
        return new GetRatingsPagedByRatingTypeResponse();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookie }
     * 
     * @return 
     */
    public LoginUserAndReturnCookie createLoginUserAndReturnCookie() {
        return new LoginUserAndReturnCookie();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookieResponse }
     * 
     * @return 
     */
    public LoginUserAndReturnCookieResponse createLoginUserAndReturnCookieResponse() {
        return new LoginUserAndReturnCookieResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     * @return 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookieWithExtraUserInfo }
     * 
     * @return 
     */
    public LoginUserAndReturnCookieWithExtraUserInfo createLoginUserAndReturnCookieWithExtraUserInfo() {
        return new LoginUserAndReturnCookieWithExtraUserInfo();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookieWithExtraUserInfoResponse }
     * 
     * @return 
     */
    public LoginUserAndReturnCookieWithExtraUserInfoResponse createLoginUserAndReturnCookieWithExtraUserInfoResponse() {
        return new LoginUserAndReturnCookieWithExtraUserInfoResponse();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookieWithEncryptedPassword }
     * 
     * @return 
     */
    public LoginUserAndReturnCookieWithEncryptedPassword createLoginUserAndReturnCookieWithEncryptedPassword() {
        return new LoginUserAndReturnCookieWithEncryptedPassword();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookieWithEncryptedPasswordResponse }
     * 
     * @return 
     */
    public LoginUserAndReturnCookieWithEncryptedPasswordResponse createLoginUserAndReturnCookieWithEncryptedPasswordResponse() {
        return new LoginUserAndReturnCookieWithEncryptedPasswordResponse();
    }

    /**
     * Create an instance of {@link ForgotPassword }
     * 
     * @return 
     */
    public ForgotPassword createForgotPassword() {
        return new ForgotPassword();
    }

    /**
     * Create an instance of {@link ForgotPasswordResponse }
     * 
     * @return 
     */
    public ForgotPasswordResponse createForgotPasswordResponse() {
        return new ForgotPasswordResponse();
    }

    /**
     * Create an instance of {@link ForgotPasswordCallResponse }
     * 
     * @return 
     */
    public ForgotPasswordCallResponse createForgotPasswordCallResponse() {
        return new ForgotPasswordCallResponse();
    }

    /**
     * Create an instance of {@link ForgotPasswordByLangID }
     * 
     * @return 
     */
    public ForgotPasswordByLangID createForgotPasswordByLangID() {
        return new ForgotPasswordByLangID();
    }

    /**
     * Create an instance of {@link ForgotPasswordByLangIDResponse }
     * 
     * @return 
     */
    public ForgotPasswordByLangIDResponse createForgotPasswordByLangIDResponse() {
        return new ForgotPasswordByLangIDResponse();
    }

    /**
     * Create an instance of {@link LogoutUserAndReturnCookie }
     * 
     * @return 
     */
    public LogoutUserAndReturnCookie createLogoutUserAndReturnCookie() {
        return new LogoutUserAndReturnCookie();
    }

    /**
     * Create an instance of {@link LogoutUserAndReturnCookieResponse }
     * 
     * @return 
     */
    public LogoutUserAndReturnCookieResponse createLogoutUserAndReturnCookieResponse() {
        return new LogoutUserAndReturnCookieResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     * @return 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     * @return 
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     * @return 
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link RegisterNewUser }
     * 
     * @return 
     */
    public RegisterNewUser createRegisterNewUser() {
        return new RegisterNewUser();
    }

    /**
     * Create an instance of {@link RegisterNewUserResponse }
     * 
     * @return 
     */
    public RegisterNewUserResponse createRegisterNewUserResponse() {
        return new RegisterNewUserResponse();
    }

    /**
     * Create an instance of {@link RegisterNewUserWithExtraUserInfo }
     * 
     * @return 
     */
    public RegisterNewUserWithExtraUserInfo createRegisterNewUserWithExtraUserInfo() {
        return new RegisterNewUserWithExtraUserInfo();
    }

    /**
     * Create an instance of {@link RegisterNewUserWithExtraUserInfoResponse }
     * 
     * @return 
     */
    public RegisterNewUserWithExtraUserInfoResponse createRegisterNewUserWithExtraUserInfoResponse() {
        return new RegisterNewUserWithExtraUserInfoResponse();
    }

    /**
     * Create an instance of {@link UpdateUserProfile }
     * 
     * @return 
     */
    public UpdateUserProfile createUpdateUserProfile() {
        return new UpdateUserProfile();
    }

    /**
     * Create an instance of {@link UpdateUserProfileResponse }
     * 
     * @return 
     */
    public UpdateUserProfileResponse createUpdateUserProfileResponse() {
        return new UpdateUserProfileResponse();
    }

    /**
     * Create an instance of {@link AddRecipeToRecipeBox }
     * 
     * @return 
     */
    public AddRecipeToRecipeBox createAddRecipeToRecipeBox() {
        return new AddRecipeToRecipeBox();
    }

    /**
     * Create an instance of {@link AddRecipeToRecipeBoxResponse }
     * 
     * @return 
     */
    public AddRecipeToRecipeBoxResponse createAddRecipeToRecipeBoxResponse() {
        return new AddRecipeToRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link RecipeBoxResponse }
     * 
     * @return 
     */
    public RecipeBoxResponse createRecipeBoxResponse() {
        return new RecipeBoxResponse();
    }

    /**
     * Create an instance of {@link AddRecipesToRecipeBox }
     * 
     * @return 
     */
    public AddRecipesToRecipeBox createAddRecipesToRecipeBox() {
        return new AddRecipesToRecipeBox();
    }

    /**
     * Create an instance of {@link AddRecipesToRecipeBoxResponse }
     * 
     * @return 
     */
    public AddRecipesToRecipeBoxResponse createAddRecipesToRecipeBoxResponse() {
        return new AddRecipesToRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link DeleteRecipeFromRecipeBox }
     * 
     * @return 
     */
    public DeleteRecipeFromRecipeBox createDeleteRecipeFromRecipeBox() {
        return new DeleteRecipeFromRecipeBox();
    }

    /**
     * Create an instance of {@link DeleteRecipeFromRecipeBoxResponse }
     * 
     * @return 
     */
    public DeleteRecipeFromRecipeBoxResponse createDeleteRecipeFromRecipeBoxResponse() {
        return new DeleteRecipeFromRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     * @return 
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link DeleteRecipesFromRecipeBox }
     * 
     * @return 
     */
    public DeleteRecipesFromRecipeBox createDeleteRecipesFromRecipeBox() {
        return new DeleteRecipesFromRecipeBox();
    }

    /**
     * Create an instance of {@link DeleteRecipesFromRecipeBoxResponse }
     * 
     * @return 
     */
    public DeleteRecipesFromRecipeBoxResponse createDeleteRecipesFromRecipeBoxResponse() {
        return new DeleteRecipesFromRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link GetRecipesFromRecipeBox }
     * 
     * @return 
     */
    public GetRecipesFromRecipeBox createGetRecipesFromRecipeBox() {
        return new GetRecipesFromRecipeBox();
    }

    /**
     * Create an instance of {@link GetRecipesFromRecipeBoxResponse }
     * 
     * @return 
     */
    public GetRecipesFromRecipeBoxResponse createGetRecipesFromRecipeBoxResponse() {
        return new GetRecipesFromRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link RecipeBoxRecipeSummariesResponse }
     * 
     * @return 
     */
    public RecipeBoxRecipeSummariesResponse createRecipeBoxRecipeSummariesResponse() {
        return new RecipeBoxRecipeSummariesResponse();
    }

    /**
     * Create an instance of {@link GetRecipesFromRecipeBoxByCategory }
     * 
     * @return 
     */
    public GetRecipesFromRecipeBoxByCategory createGetRecipesFromRecipeBoxByCategory() {
        return new GetRecipesFromRecipeBoxByCategory();
    }

    /**
     * Create an instance of {@link GetRecipesFromRecipeBoxByCategoryResponse }
     * 
     * @return 
     */
    public GetRecipesFromRecipeBoxByCategoryResponse createGetRecipesFromRecipeBoxByCategoryResponse() {
        return new GetRecipesFromRecipeBoxByCategoryResponse();
    }

    /**
     * Create an instance of {@link IsRecipeInRecipeBox }
     * 
     * @return 
     */
    public IsRecipeInRecipeBox createIsRecipeInRecipeBox() {
        return new IsRecipeInRecipeBox();
    }

    /**
     * Create an instance of {@link IsRecipeInRecipeBoxResponse }
     * 
     * @return 
     */
    public IsRecipeInRecipeBoxResponse createIsRecipeInRecipeBoxResponse() {
        return new IsRecipeInRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link RecipeInRecipeBoxResponse }
     * 
     * @return 
     */
    public RecipeInRecipeBoxResponse createRecipeInRecipeBoxResponse() {
        return new RecipeInRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link GetShoppingLists }
     * 
     * @return 
     */
    public GetShoppingLists createGetShoppingLists() {
        return new GetShoppingLists();
    }

    /**
     * Create an instance of {@link GetShoppingListsResponse }
     * 
     * @return 
     */
    public GetShoppingListsResponse createGetShoppingListsResponse() {
        return new GetShoppingListsResponse();
    }

    /**
     * Create an instance of {@link ShoppingListsResponse }
     * 
     * @return 
     */
    public ShoppingListsResponse createShoppingListsResponse() {
        return new ShoppingListsResponse();
    }

    /**
     * Create an instance of {@link GetDefaultShoppingList }
     * 
     * @return 
     */
    public GetDefaultShoppingList createGetDefaultShoppingList() {
        return new GetDefaultShoppingList();
    }

    /**
     * Create an instance of {@link GetDefaultShoppingListResponse }
     * 
     * @return 
     */
    public GetDefaultShoppingListResponse createGetDefaultShoppingListResponse() {
        return new GetDefaultShoppingListResponse();
    }

    /**
     * Create an instance of {@link ShoppingListResponse }
     * 
     * @return 
     */
    public ShoppingListResponse createShoppingListResponse() {
        return new ShoppingListResponse();
    }

    /**
     * Create an instance of {@link GetShoppingListSorted }
     * 
     * @return 
     */
    public GetShoppingListSorted createGetShoppingListSorted() {
        return new GetShoppingListSorted();
    }

    /**
     * Create an instance of {@link GetShoppingListSortedResponse }
     * 
     * @return 
     */
    public GetShoppingListSortedResponse createGetShoppingListSortedResponse() {
        return new GetShoppingListSortedResponse();
    }

    /**
     * Create an instance of {@link SortedShoppingListResponse }
     * 
     * @return 
     */
    public SortedShoppingListResponse createSortedShoppingListResponse() {
        return new SortedShoppingListResponse();
    }

    /**
     * Create an instance of {@link AddShoppingList }
     * 
     * @return 
     */
    public AddShoppingList createAddShoppingList() {
        return new AddShoppingList();
    }

    /**
     * Create an instance of {@link AddShoppingListResponse }
     * 
     * @return 
     */
    public AddShoppingListResponse createAddShoppingListResponse() {
        return new AddShoppingListResponse();
    }

    /**
     * Create an instance of {@link EditShoppingList }
     * 
     * @return 
     */
    public EditShoppingList createEditShoppingList() {
        return new EditShoppingList();
    }

    /**
     * Create an instance of {@link EditShoppingListResponse }
     * 
     * @return 
     */
    public EditShoppingListResponse createEditShoppingListResponse() {
        return new EditShoppingListResponse();
    }

    /**
     * Create an instance of {@link EditShoppingListItem }
     * 
     * @return 
     */
    public EditShoppingListItem createEditShoppingListItem() {
        return new EditShoppingListItem();
    }

    /**
     * Create an instance of {@link EditShoppingListItemResponse }
     * 
     * @return 
     */
    public EditShoppingListItemResponse createEditShoppingListItemResponse() {
        return new EditShoppingListItemResponse();
    }

    /**
     * Create an instance of {@link EditShoppingListItemResponseNew }
     * 
     * @return 
     */
    public EditShoppingListItemResponseNew createEditShoppingListItemResponseNew() {
        return new EditShoppingListItemResponseNew();
    }

    /**
     * Create an instance of {@link DeleteShoppingList }
     * 
     * @return 
     */
    public DeleteShoppingList createDeleteShoppingList() {
        return new DeleteShoppingList();
    }

    /**
     * Create an instance of {@link DeleteShoppingListResponse }
     * 
     * @return 
     */
    public DeleteShoppingListResponse createDeleteShoppingListResponse() {
        return new DeleteShoppingListResponse();
    }

    /**
     * Create an instance of {@link AddItemToShoppingList }
     * 
     * @return 
     */
    public AddItemToShoppingList createAddItemToShoppingList() {
        return new AddItemToShoppingList();
    }

    /**
     * Create an instance of {@link AddItemToShoppingListResponse }
     * 
     * @return 
     */
    public AddItemToShoppingListResponse createAddItemToShoppingListResponse() {
        return new AddItemToShoppingListResponse();
    }

    /**
     * Create an instance of {@link AddItemToShoppingListReturnItemListId }
     * 
     * @return 
     */
    public AddItemToShoppingListReturnItemListId createAddItemToShoppingListReturnItemListId() {
        return new AddItemToShoppingListReturnItemListId();
    }

    /**
     * Create an instance of {@link AddItemToShoppingListReturnItemListIdResponse }
     * 
     * @return 
     */
    public AddItemToShoppingListReturnItemListIdResponse createAddItemToShoppingListReturnItemListIdResponse() {
        return new AddItemToShoppingListReturnItemListIdResponse();
    }

    /**
     * Create an instance of {@link AddItemToShoppingListResponseNew }
     * 
     * @return 
     */
    public AddItemToShoppingListResponseNew createAddItemToShoppingListResponseNew() {
        return new AddItemToShoppingListResponseNew();
    }

    /**
     * Create an instance of {@link AddItemsToShoppingListReturnItemListIds }
     * 
     * @return 
     */
    public AddItemsToShoppingListReturnItemListIds createAddItemsToShoppingListReturnItemListIds() {
        return new AddItemsToShoppingListReturnItemListIds();
    }

    /**
     * Create an instance of {@link AddItemsToShoppingListReturnItemListIdsResponse }
     * 
     * @return 
     */
    public AddItemsToShoppingListReturnItemListIdsResponse createAddItemsToShoppingListReturnItemListIdsResponse() {
        return new AddItemsToShoppingListReturnItemListIdsResponse();
    }

    /**
     * Create an instance of {@link DeleteItemFromShoppingList }
     * 
     * @return 
     */
    public DeleteItemFromShoppingList createDeleteItemFromShoppingList() {
        return new DeleteItemFromShoppingList();
    }

    /**
     * Create an instance of {@link DeleteItemFromShoppingListResponse }
     * 
     * @return 
     */
    public DeleteItemFromShoppingListResponse createDeleteItemFromShoppingListResponse() {
        return new DeleteItemFromShoppingListResponse();
    }

    /**
     * Create an instance of {@link DeleteItemsFromShoppingList }
     * 
     * @return 
     */
    public DeleteItemsFromShoppingList createDeleteItemsFromShoppingList() {
        return new DeleteItemsFromShoppingList();
    }

    /**
     * Create an instance of {@link DeleteItemsFromShoppingListResponse }
     * 
     * @return 
     */
    public DeleteItemsFromShoppingListResponse createDeleteItemsFromShoppingListResponse() {
        return new DeleteItemsFromShoppingListResponse();
    }

    /**
     * Create an instance of {@link AddRecipeToShoppingList }
     * 
     * @return 
     */
    public AddRecipeToShoppingList createAddRecipeToShoppingList() {
        return new AddRecipeToShoppingList();
    }

    /**
     * Create an instance of {@link AddRecipeToShoppingListResponse }
     * 
     * @return 
     */
    public AddRecipeToShoppingListResponse createAddRecipeToShoppingListResponse() {
        return new AddRecipeToShoppingListResponse();
    }

    /**
     * Create an instance of {@link AddRecipesToShoppingList }
     * 
     * @return 
     */
    public AddRecipesToShoppingList createAddRecipesToShoppingList() {
        return new AddRecipesToShoppingList();
    }

    /**
     * Create an instance of {@link AddRecipesToShoppingListResponse }
     * 
     * @return 
     */
    public AddRecipesToShoppingListResponse createAddRecipesToShoppingListResponse() {
        return new AddRecipesToShoppingListResponse();
    }

    /**
     * Create an instance of {@link RecipeBoxShoppingListResponses }
     * 
     * @return 
     */
    public RecipeBoxShoppingListResponses createRecipeBoxShoppingListResponses() {
        return new RecipeBoxShoppingListResponses();
    }

    /**
     * Create an instance of {@link AddRecipeToRecipeBoxShoppingList }
     * 
     * @return 
     */
    public AddRecipeToRecipeBoxShoppingList createAddRecipeToRecipeBoxShoppingList() {
        return new AddRecipeToRecipeBoxShoppingList();
    }

    /**
     * Create an instance of {@link AddRecipeToRecipeBoxShoppingListResponse }
     * 
     * @return 
     */
    public AddRecipeToRecipeBoxShoppingListResponse createAddRecipeToRecipeBoxShoppingListResponse() {
        return new AddRecipeToRecipeBoxShoppingListResponse();
    }

    /**
     * Create an instance of {@link RecipeBoxShoppingListResponse }
     * 
     * @return 
     */
    public RecipeBoxShoppingListResponse createRecipeBoxShoppingListResponse() {
        return new RecipeBoxShoppingListResponse();
    }

    /**
     * Create an instance of {@link GetStoresByLatAndLong }
     * 
     * @return 
     */
    public GetStoresByLatAndLong createGetStoresByLatAndLong() {
        return new GetStoresByLatAndLong();
    }

    /**
     * Create an instance of {@link GetStoresByLatAndLongResponse }
     * 
     * @return 
     */
    public GetStoresByLatAndLongResponse createGetStoresByLatAndLongResponse() {
        return new GetStoresByLatAndLongResponse();
    }

    /**
     * Create an instance of {@link StoreSummariesResponse }
     * 
     * @return 
     */
    public StoreSummariesResponse createStoreSummariesResponse() {
        return new StoreSummariesResponse();
    }

    /**
     * Create an instance of {@link GetCoremetricsVisitorID }
     * 
     * @return 
     */
    public GetCoremetricsVisitorID createGetCoremetricsVisitorID() {
        return new GetCoremetricsVisitorID();
    }

    /**
     * Create an instance of {@link GetCoremetricsVisitorIDResponse }
     * 
     * @return 
     */
    public GetCoremetricsVisitorIDResponse createGetCoremetricsVisitorIDResponse() {
        return new GetCoremetricsVisitorIDResponse();
    }

    /**
     * Create an instance of {@link CoremetricsResponse }
     * 
     * @return 
     */
    public CoremetricsResponse createCoremetricsResponse() {
        return new CoremetricsResponse();
    }

    /**
     * Create an instance of {@link GetCoremetricsSessionID }
     * 
     * @return 
     */
    public GetCoremetricsSessionID createGetCoremetricsSessionID() {
        return new GetCoremetricsSessionID();
    }

    /**
     * Create an instance of {@link GetCoremetricsSessionIDResponse }
     * 
     * @return 
     */
    public GetCoremetricsSessionIDResponse createGetCoremetricsSessionIDResponse() {
        return new GetCoremetricsSessionIDResponse();
    }

    /**
     * Create an instance of {@link SendTrackingData }
     * 
     * @return 
     */
    public SendTrackingData createSendTrackingData() {
        return new SendTrackingData();
    }

    /**
     * Create an instance of {@link SendTrackingDataResponse }
     * 
     * @return 
     */
    public SendTrackingDataResponse createSendTrackingDataResponse() {
        return new SendTrackingDataResponse();
    }

    /**
     * Create an instance of {@link SendConversionEventTrackingData }
     * 
     * @return 
     */
    public SendConversionEventTrackingData createSendConversionEventTrackingData() {
        return new SendConversionEventTrackingData();
    }

    /**
     * Create an instance of {@link SendConversionEventTrackingDataResponse }
     * 
     * @return 
     */
    public SendConversionEventTrackingDataResponse createSendConversionEventTrackingDataResponse() {
        return new SendConversionEventTrackingDataResponse();
    }

    /**
     * Create an instance of {@link RateItem }
     * 
     * @return 
     */
    public RateItem createRateItem() {
        return new RateItem();
    }

    /**
     * Create an instance of {@link RateItemResponse }
     * 
     * @return 
     */
    public RateItemResponse createRateItemResponse() {
        return new RateItemResponse();
    }

    /**
     * Create an instance of {@link SendPageViewTrackingData }
     * 
     * @return 
     */
    public SendPageViewTrackingData createSendPageViewTrackingData() {
        return new SendPageViewTrackingData();
    }

    /**
     * Create an instance of {@link SendPageViewTrackingDataResponse }
     * 
     * @return 
     */
    public SendPageViewTrackingDataResponse createSendPageViewTrackingDataResponse() {
        return new SendPageViewTrackingDataResponse();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     * @return 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     * @return 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link SendRecipeToEmail }
     * 
     * @return 
     */
    public SendRecipeToEmail createSendRecipeToEmail() {
        return new SendRecipeToEmail();
    }

    /**
     * Create an instance of {@link SendRecipeToEmailResponse }
     * 
     * @return 
     */
    public SendRecipeToEmailResponse createSendRecipeToEmailResponse() {
        return new SendRecipeToEmailResponse();
    }

    /**
     * Create an instance of {@link SendSMSMessage }
     * 
     * @return 
     */
    public SendSMSMessage createSendSMSMessage() {
        return new SendSMSMessage();
    }

    /**
     * Create an instance of {@link SendSMSMessageResponse }
     * 
     * @return 
     */
    public SendSMSMessageResponse createSendSMSMessageResponse() {
        return new SendSMSMessageResponse();
    }

    /**
     * Create an instance of {@link RateRecipe }
     * 
     * @return 
     */
    public RateRecipe createRateRecipe() {
        return new RateRecipe();
    }

    /**
     * Create an instance of {@link RateRecipeResponse }
     * 
     * @return 
     */
    public RateRecipeResponse createRateRecipeResponse() {
        return new RateRecipeResponse();
    }

    /**
     * Create an instance of {@link GetTopTenRecipes }
     * 
     * @return 
     */
    public GetTopTenRecipes createGetTopTenRecipes() {
        return new GetTopTenRecipes();
    }

    /**
     * Create an instance of {@link GetTopTenRecipesResponse }
     * 
     * @return 
     */
    public GetTopTenRecipesResponse createGetTopTenRecipesResponse() {
        return new GetTopTenRecipesResponse();
    }

    /**
     * Create an instance of {@link GetTopTenRecipesByCategory }
     * 
     * @return 
     */
    public GetTopTenRecipesByCategory createGetTopTenRecipesByCategory() {
        return new GetTopTenRecipesByCategory();
    }

    /**
     * Create an instance of {@link GetTopTenRecipesByCategoryResponse }
     * 
     * @return 
     */
    public GetTopTenRecipesByCategoryResponse createGetTopTenRecipesByCategoryResponse() {
        return new GetTopTenRecipesByCategoryResponse();
    }

    /**
     * Create an instance of {@link GetWYDRecipes }
     * 
     * @return 
     */
    public GetWYDRecipes createGetWYDRecipes() {
        return new GetWYDRecipes();
    }

    /**
     * Create an instance of {@link GetWYDRecipesResponse }
     * 
     * @return 
     */
    public GetWYDRecipesResponse createGetWYDRecipesResponse() {
        return new GetWYDRecipesResponse();
    }

    /**
     * Create an instance of {@link GetCookingVideos }
     * 
     * @return 
     */
    public GetCookingVideos createGetCookingVideos() {
        return new GetCookingVideos();
    }

    /**
     * Create an instance of {@link GetCookingVideosResponse }
     * 
     * @return 
     */
    public GetCookingVideosResponse createGetCookingVideosResponse() {
        return new GetCookingVideosResponse();
    }

    /**
     * Create an instance of {@link VideoRecipeSummariesResponse }
     * 
     * @return 
     */
    public VideoRecipeSummariesResponse createVideoRecipeSummariesResponse() {
        return new VideoRecipeSummariesResponse();
    }

    /**
     * Create an instance of {@link GetDinnerTonight }
     * 
     * @return 
     */
    public GetDinnerTonight createGetDinnerTonight() {
        return new GetDinnerTonight();
    }

    /**
     * Create an instance of {@link GetDinnerTonightResponse }
     * 
     * @return 
     */
    public GetDinnerTonightResponse createGetDinnerTonightResponse() {
        return new GetDinnerTonightResponse();
    }

    /**
     * Create an instance of {@link DTSummariesResponse }
     * 
     * @return 
     */
    public DTSummariesResponse createDTSummariesResponse() {
        return new DTSummariesResponse();
    }

    /**
     * Create an instance of {@link GetDinnerTonightForWeek }
     * 
     * @return 
     */
    public GetDinnerTonightForWeek createGetDinnerTonightForWeek() {
        return new GetDinnerTonightForWeek();
    }

    /**
     * Create an instance of {@link GetDinnerTonightForWeekResponse }
     * 
     * @return 
     */
    public GetDinnerTonightForWeekResponse createGetDinnerTonightForWeekResponse() {
        return new GetDinnerTonightForWeekResponse();
    }

    /**
     * Create an instance of {@link GetCookingVideoForRecipeID }
     * 
     * @return 
     */
    public GetCookingVideoForRecipeID createGetCookingVideoForRecipeID() {
        return new GetCookingVideoForRecipeID();
    }

    /**
     * Create an instance of {@link GetCookingVideoForRecipeIDResponse }
     * 
     * @return 
     */
    public GetCookingVideoForRecipeIDResponse createGetCookingVideoForRecipeIDResponse() {
        return new GetCookingVideoForRecipeIDResponse();
    }

    /**
     * Create an instance of {@link GetWYDRecipeSubCategory }
     * 
     * @return 
     */
    public GetWYDRecipeSubCategory createGetWYDRecipeSubCategory() {
        return new GetWYDRecipeSubCategory();
    }

    /**
     * Create an instance of {@link GetWYDRecipeSubCategoryResponse }
     * 
     * @return 
     */
    public GetWYDRecipeSubCategoryResponse createGetWYDRecipeSubCategoryResponse() {
        return new GetWYDRecipeSubCategoryResponse();
    }

    /**
     * Create an instance of {@link RecipeSubCategoryResponse }
     * 
     * @return 
     */
    public RecipeSubCategoryResponse createRecipeSubCategoryResponse() {
        return new RecipeSubCategoryResponse();
    }

    /**
     * Create an instance of {@link GetCookingVideosSubCategory }
     * 
     * @return 
     */
    public GetCookingVideosSubCategory createGetCookingVideosSubCategory() {
        return new GetCookingVideosSubCategory();
    }

    /**
     * Create an instance of {@link GetCookingVideosSubCategoryResponse }
     * 
     * @return 
     */
    public GetCookingVideosSubCategoryResponse createGetCookingVideosSubCategoryResponse() {
        return new GetCookingVideosSubCategoryResponse();
    }

    /**
     * Create an instance of {@link GetPollsByPollIDs }
     * 
     * @return 
     */
    public GetPollsByPollIDs createGetPollsByPollIDs() {
        return new GetPollsByPollIDs();
    }

    /**
     * Create an instance of {@link GetPollsByPollIDsResponse }
     * 
     * @return 
     */
    public GetPollsByPollIDsResponse createGetPollsByPollIDsResponse() {
        return new GetPollsByPollIDsResponse();
    }

    /**
     * Create an instance of {@link PollDetailsResponse }
     * 
     * @return 
     */
    public PollDetailsResponse createPollDetailsResponse() {
        return new PollDetailsResponse();
    }

    /**
     * Create an instance of {@link GetPollsByRelationID }
     * 
     * @return 
     */
    public GetPollsByRelationID createGetPollsByRelationID() {
        return new GetPollsByRelationID();
    }

    /**
     * Create an instance of {@link GetPollsByRelationIDResponse }
     * 
     * @return 
     */
    public GetPollsByRelationIDResponse createGetPollsByRelationIDResponse() {
        return new GetPollsByRelationIDResponse();
    }

    /**
     * Create an instance of {@link TestJSON }
     * 
     * @return 
     */
    public TestJSON createTestJSON() {
        return new TestJSON();
    }

    /**
     * Create an instance of {@link TestJSONResponse }
     * 
     * @return 
     */
    public TestJSONResponse createTestJSONResponse() {
        return new TestJSONResponse();
    }

    /**
     * Create an instance of {@link AnswerPoll }
     * 
     * @return 
     */
    public AnswerPoll createAnswerPoll() {
        return new AnswerPoll();
    }

    /**
     * Create an instance of {@link AnswerPollResponse }
     * 
     * @return 
     */
    public AnswerPollResponse createAnswerPollResponse() {
        return new AnswerPollResponse();
    }

    /**
     * Create an instance of {@link GetNodesByCategoryList }
     * 
     * @return 
     */
    public GetNodesByCategoryList createGetNodesByCategoryList() {
        return new GetNodesByCategoryList();
    }

    /**
     * Create an instance of {@link GetNodesByCategoryListResponse }
     * 
     * @return 
     */
    public GetNodesByCategoryListResponse createGetNodesByCategoryListResponse() {
        return new GetNodesByCategoryListResponse();
    }

    /**
     * Create an instance of {@link GetSiteUserAcctPointsLeft }
     * 
     * @return 
     */
    public GetSiteUserAcctPointsLeft createGetSiteUserAcctPointsLeft() {
        return new GetSiteUserAcctPointsLeft();
    }

    /**
     * Create an instance of {@link GetSiteUserAcctPointsLeftResponse }
     * 
     * @return 
     */
    public GetSiteUserAcctPointsLeftResponse createGetSiteUserAcctPointsLeftResponse() {
        return new GetSiteUserAcctPointsLeftResponse();
    }

    /**
     * Create an instance of {@link SiteUserAcctPointsLeftResponse }
     * 
     * @return 
     */
    public SiteUserAcctPointsLeftResponse createSiteUserAcctPointsLeftResponse() {
        return new SiteUserAcctPointsLeftResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByDates }
     * 
     * @return 
     */
    public GetRecipesByDates createGetRecipesByDates() {
        return new GetRecipesByDates();
    }

    /**
     * Create an instance of {@link GetRecipesByDatesResponse }
     * 
     * @return 
     */
    public GetRecipesByDatesResponse createGetRecipesByDatesResponse() {
        return new GetRecipesByDatesResponse();
    }

    /**
     * Create an instance of {@link RecipeSummaryDetailsResponse }
     * 
     * @return 
     */
    public RecipeSummaryDetailsResponse createRecipeSummaryDetailsResponse() {
        return new RecipeSummaryDetailsResponse();
    }

    /**
     * Create an instance of {@link GetTraditionalRecipesByDates }
     * 
     * @return 
     */
    public GetTraditionalRecipesByDates createGetTraditionalRecipesByDates() {
        return new GetTraditionalRecipesByDates();
    }

    /**
     * Create an instance of {@link GetTraditionalRecipesByDatesResponse }
     * 
     * @return 
     */
    public GetTraditionalRecipesByDatesResponse createGetTraditionalRecipesByDatesResponse() {
        return new GetTraditionalRecipesByDatesResponse();
    }

    /**
     * Create an instance of {@link RecipeDetailResponses }
     * 
     * @return 
     */
    public RecipeDetailResponses createRecipeDetailResponses() {
        return new RecipeDetailResponses();
    }

    /**
     * Create an instance of {@link UserOptin }
     * 
     * @return 
     */
    public UserOptin createUserOptin() {
        return new UserOptin();
    }

    /**
     * Create an instance of {@link UserOptinResponse }
     * 
     * @return 
     */
    public UserOptinResponse createUserOptinResponse() {
        return new UserOptinResponse();
    }

    /**
     * Create an instance of {@link OptinSummaryResponse }
     * 
     * @return 
     */
    public OptinSummaryResponse createOptinSummaryResponse() {
        return new OptinSummaryResponse();
    }

    /**
     * Create an instance of {@link UserAnswerUpdate }
     * 
     * @return 
     */
    public UserAnswerUpdate createUserAnswerUpdate() {
        return new UserAnswerUpdate();
    }

    /**
     * Create an instance of {@link UserAnswerUpdateResponse }
     * 
     * @return 
     */
    public UserAnswerUpdateResponse createUserAnswerUpdateResponse() {
        return new UserAnswerUpdateResponse();
    }

    /**
     * Create an instance of {@link UpadteUserAnswerResponse }
     * 
     * @return 
     */
    public UpadteUserAnswerResponse createUpadteUserAnswerResponse() {
        return new UpadteUserAnswerResponse();
    }

    /**
     * Create an instance of {@link UserOptinUpdate }
     * 
     * @return 
     */
    public UserOptinUpdate createUserOptinUpdate() {
        return new UserOptinUpdate();
    }

    /**
     * Create an instance of {@link UserOptinUpdateResponse }
     * 
     * @return 
     */
    public UserOptinUpdateResponse createUserOptinUpdateResponse() {
        return new UserOptinUpdateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeSummary }
     * 
     * @return 
     */
    public ArrayOfRecipeSummary createArrayOfRecipeSummary() {
        return new ArrayOfRecipeSummary();
    }

    /**
     * Create an instance of {@link RecipeSummary }
     * 
     * @return 
     */
    public RecipeSummary createRecipeSummary() {
        return new RecipeSummary();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeClassification }
     * 
     * @return 
     */
    public ArrayOfRecipeClassification createArrayOfRecipeClassification() {
        return new ArrayOfRecipeClassification();
    }

    /**
     * Create an instance of {@link RecipeClassification }
     * 
     * @return 
     */
    public RecipeClassification createRecipeClassification() {
        return new RecipeClassification();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeCategory }
     * 
     * @return 
     */
    public ArrayOfRecipeCategory createArrayOfRecipeCategory() {
        return new ArrayOfRecipeCategory();
    }

    /**
     * Create an instance of {@link RecipeCategory }
     * 
     * @return 
     */
    public RecipeCategory createRecipeCategory() {
        return new RecipeCategory();
    }

    /**
     * Create an instance of {@link ArrayOfCookingVideoAd }
     * 
     * @return 
     */
    public ArrayOfCookingVideoAd createArrayOfCookingVideoAd() {
        return new ArrayOfCookingVideoAd();
    }

    /**
     * Create an instance of {@link CookingVideoAd }
     * 
     * @return 
     */
    public CookingVideoAd createCookingVideoAd() {
        return new CookingVideoAd();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeFlashVideo }
     * 
     * @return 
     */
    public ArrayOfRecipeFlashVideo createArrayOfRecipeFlashVideo() {
        return new ArrayOfRecipeFlashVideo();
    }

    /**
     * Create an instance of {@link RecipeFlashVideo }
     * 
     * @return 
     */
    public RecipeFlashVideo createRecipeFlashVideo() {
        return new RecipeFlashVideo();
    }

    /**
     * Create an instance of {@link ArrayOfROTDSummary }
     * 
     * @return 
     */
    public ArrayOfROTDSummary createArrayOfROTDSummary() {
        return new ArrayOfROTDSummary();
    }

    /**
     * Create an instance of {@link ROTDSummary }
     * 
     * @return 
     */
    public ROTDSummary createROTDSummary() {
        return new ROTDSummary();
    }

    /**
     * Create an instance of {@link MemberRecipeDetail }
     * 
     * @return 
     */
    public MemberRecipeDetail createMemberRecipeDetail() {
        return new MemberRecipeDetail();
    }

    /**
     * Create an instance of {@link MemberRecipeSummary }
     * 
     * @return 
     */
    public MemberRecipeSummary createMemberRecipeSummary() {
        return new MemberRecipeSummary();
    }

    /**
     * Create an instance of {@link ArrayOfRatingDetail }
     * 
     * @return 
     */
    public ArrayOfRatingDetail createArrayOfRatingDetail() {
        return new ArrayOfRatingDetail();
    }

    /**
     * Create an instance of {@link RatingDetail }
     * 
     * @return 
     */
    public RatingDetail createRatingDetail() {
        return new RatingDetail();
    }

    /**
     * Create an instance of {@link RecipeDetail }
     * 
     * @return 
     */
    public RecipeDetail createRecipeDetail() {
        return new RecipeDetail();
    }

    /**
     * Create an instance of {@link ArrayOfIngredientDetail }
     * 
     * @return 
     */
    public ArrayOfIngredientDetail createArrayOfIngredientDetail() {
        return new ArrayOfIngredientDetail();
    }

    /**
     * Create an instance of {@link IngredientDetail }
     * 
     * @return 
     */
    public IngredientDetail createIngredientDetail() {
        return new IngredientDetail();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeIngredientGridHeaderDetail }
     * 
     * @return 
     */
    public ArrayOfRecipeIngredientGridHeaderDetail createArrayOfRecipeIngredientGridHeaderDetail() {
        return new ArrayOfRecipeIngredientGridHeaderDetail();
    }

    /**
     * Create an instance of {@link RecipeIngredientGridHeaderDetail }
     * 
     * @return 
     */
    public RecipeIngredientGridHeaderDetail createRecipeIngredientGridHeaderDetail() {
        return new RecipeIngredientGridHeaderDetail();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeIngredientGridDetail }
     * 
     * @return 
     */
    public ArrayOfRecipeIngredientGridDetail createArrayOfRecipeIngredientGridDetail() {
        return new ArrayOfRecipeIngredientGridDetail();
    }

    /**
     * Create an instance of {@link RecipeIngredientGridDetail }
     * 
     * @return 
     */
    public RecipeIngredientGridDetail createRecipeIngredientGridDetail() {
        return new RecipeIngredientGridDetail();
    }

    /**
     * Create an instance of {@link ArrayOfPreparationDetail }
     * 
     * @return 
     */
    public ArrayOfPreparationDetail createArrayOfPreparationDetail() {
        return new ArrayOfPreparationDetail();
    }

    /**
     * Create an instance of {@link PreparationDetail }
     * 
     * @return 
     */
    public PreparationDetail createPreparationDetail() {
        return new PreparationDetail();
    }

    /**
     * Create an instance of {@link ArrayOfNutritionItemDetail }
     * 
     * @return 
     */
    public ArrayOfNutritionItemDetail createArrayOfNutritionItemDetail() {
        return new ArrayOfNutritionItemDetail();
    }

    /**
     * Create an instance of {@link NutritionItemDetail }
     * 
     * @return 
     */
    public NutritionItemDetail createNutritionItemDetail() {
        return new NutritionItemDetail();
    }

    /**
     * Create an instance of {@link ArrayOfNutritionGridItemDetail }
     * 
     * @return 
     */
    public ArrayOfNutritionGridItemDetail createArrayOfNutritionGridItemDetail() {
        return new ArrayOfNutritionGridItemDetail();
    }

    /**
     * Create an instance of {@link NutritionGridItemDetail }
     * 
     * @return 
     */
    public NutritionGridItemDetail createNutritionGridItemDetail() {
        return new NutritionGridItemDetail();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeTipDetail }
     * 
     * @return 
     */
    public ArrayOfRecipeTipDetail createArrayOfRecipeTipDetail() {
        return new ArrayOfRecipeTipDetail();
    }

    /**
     * Create an instance of {@link RecipeTipDetail }
     * 
     * @return 
     */
    public RecipeTipDetail createRecipeTipDetail() {
        return new RecipeTipDetail();
    }

    /**
     * Create an instance of {@link CookieResponseEntity }
     * 
     * @return 
     */
    public CookieResponseEntity createCookieResponseEntity() {
        return new CookieResponseEntity();
    }

    /**
     * Create an instance of {@link CookiePairs }
     * 
     * @return 
     */
    public CookiePairs createCookiePairs() {
        return new CookiePairs();
    }

    /**
     * Create an instance of {@link CookiePair }
     * 
     * @return 
     */
    public CookiePair createCookiePair() {
        return new CookiePair();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeBoxRecipeSummary }
     * 
     * @return 
     */
    public ArrayOfRecipeBoxRecipeSummary createArrayOfRecipeBoxRecipeSummary() {
        return new ArrayOfRecipeBoxRecipeSummary();
    }

    /**
     * Create an instance of {@link RecipeBoxRecipeSummary }
     * 
     * @return 
     */
    public RecipeBoxRecipeSummary createRecipeBoxRecipeSummary() {
        return new RecipeBoxRecipeSummary();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     * @return 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfShoppingList }
     * 
     * @return 
     */
    public ArrayOfShoppingList createArrayOfShoppingList() {
        return new ArrayOfShoppingList();
    }

    /**
     * Create an instance of {@link ShoppingList }
     * 
     * @return 
     */
    public ShoppingList createShoppingList() {
        return new ShoppingList();
    }

    /**
     * Create an instance of {@link ArrayOfShoppingListItem }
     * 
     * @return 
     */
    public ArrayOfShoppingListItem createArrayOfShoppingListItem() {
        return new ArrayOfShoppingListItem();
    }

    /**
     * Create an instance of {@link ShoppingListItem }
     * 
     * @return 
     */
    public ShoppingListItem createShoppingListItem() {
        return new ShoppingListItem();
    }

    /**
     * Create an instance of {@link ArrayOfAddItemToShoppingListResult }
     * 
     * @return 
     */
    public ArrayOfAddItemToShoppingListResult createArrayOfAddItemToShoppingListResult() {
        return new ArrayOfAddItemToShoppingListResult();
    }

    /**
     * Create an instance of {@link AddItemToShoppingListResult }
     * 
     * @return 
     */
    public AddItemToShoppingListResult createAddItemToShoppingListResult() {
        return new AddItemToShoppingListResult();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeBoxShoppingListResponse }
     * 
     * @return 
     */
    public ArrayOfRecipeBoxShoppingListResponse createArrayOfRecipeBoxShoppingListResponse() {
        return new ArrayOfRecipeBoxShoppingListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStoreSummary }
     * 
     * @return 
     */
    public ArrayOfStoreSummary createArrayOfStoreSummary() {
        return new ArrayOfStoreSummary();
    }

    /**
     * Create an instance of {@link StoreSummary }
     * 
     * @return 
     */
    public StoreSummary createStoreSummary() {
        return new StoreSummary();
    }

    /**
     * Create an instance of {@link ArrayOfVideoRecipeSummary }
     * 
     * @return 
     */
    public ArrayOfVideoRecipeSummary createArrayOfVideoRecipeSummary() {
        return new ArrayOfVideoRecipeSummary();
    }

    /**
     * Create an instance of {@link VideoRecipeSummary }
     * 
     * @return 
     */
    public VideoRecipeSummary createVideoRecipeSummary() {
        return new VideoRecipeSummary();
    }

    /**
     * Create an instance of {@link ArrayOfDTSummary }
     * 
     * @return 
     */
    public ArrayOfDTSummary createArrayOfDTSummary() {
        return new ArrayOfDTSummary();
    }

    /**
     * Create an instance of {@link DTSummary }
     * 
     * @return 
     */
    public DTSummary createDTSummary() {
        return new DTSummary();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeSubCategory }
     * 
     * @return 
     */
    public ArrayOfRecipeSubCategory createArrayOfRecipeSubCategory() {
        return new ArrayOfRecipeSubCategory();
    }

    /**
     * Create an instance of {@link RecipeSubCategory }
     * 
     * @return 
     */
    public RecipeSubCategory createRecipeSubCategory() {
        return new RecipeSubCategory();
    }

    /**
     * Create an instance of {@link ArrayOfPollDetail }
     * 
     * @return 
     */
    public ArrayOfPollDetail createArrayOfPollDetail() {
        return new ArrayOfPollDetail();
    }

    /**
     * Create an instance of {@link PollDetail }
     * 
     * @return 
     */
    public PollDetail createPollDetail() {
        return new PollDetail();
    }

    /**
     * Create an instance of {@link ArrayOfPollResultDetail }
     * 
     * @return 
     */
    public ArrayOfPollResultDetail createArrayOfPollResultDetail() {
        return new ArrayOfPollResultDetail();
    }

    /**
     * Create an instance of {@link PollResultDetail }
     * 
     * @return 
     */
    public PollResultDetail createPollResultDetail() {
        return new PollResultDetail();
    }

    /**
     * Create an instance of {@link RecipeSubCategoryResponseWPT }
     * 
     * @return 
     */
    public RecipeSubCategoryResponseWPT createRecipeSubCategoryResponseWPT() {
        return new RecipeSubCategoryResponseWPT();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeSubCategoryWPT }
     * 
     * @return 
     */
    public ArrayOfRecipeSubCategoryWPT createArrayOfRecipeSubCategoryWPT() {
        return new ArrayOfRecipeSubCategoryWPT();
    }

    /**
     * Create an instance of {@link RecipeSubCategoryWPT }
     * 
     * @return 
     */
    public RecipeSubCategoryWPT createRecipeSubCategoryWPT() {
        return new RecipeSubCategoryWPT();
    }

    /**
     * Create an instance of {@link TextResponse }
     * 
     * @return 
     */
    public TextResponse createTextResponse() {
        return new TextResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTextSummary }
     * 
     * @return 
     */
    public ArrayOfTextSummary createArrayOfTextSummary() {
        return new ArrayOfTextSummary();
    }

    /**
     * Create an instance of {@link TextSummary }
     * 
     * @return 
     */
    public TextSummary createTextSummary() {
        return new TextSummary();
    }

    /**
     * Create an instance of {@link BrandRecipeSummariesResponse }
     * 
     * @return 
     */
    public BrandRecipeSummariesResponse createBrandRecipeSummariesResponse() {
        return new BrandRecipeSummariesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBrandRecipeSummary }
     * 
     * @return 
     */
    public ArrayOfBrandRecipeSummary createArrayOfBrandRecipeSummary() {
        return new ArrayOfBrandRecipeSummary();
    }

    /**
     * Create an instance of {@link BrandRecipeSummary }
     * 
     * @return 
     */
    public BrandRecipeSummary createBrandRecipeSummary() {
        return new BrandRecipeSummary();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeSummaryDetails }
     * 
     * @return 
     */
    public ArrayOfRecipeSummaryDetails createArrayOfRecipeSummaryDetails() {
        return new ArrayOfRecipeSummaryDetails();
    }

    /**
     * Create an instance of {@link RecipeSummaryDetails }
     * 
     * @return 
     */
    public RecipeSummaryDetails createRecipeSummaryDetails() {
        return new RecipeSummaryDetails();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeDetail }
     * 
     * @return 
     */
    public ArrayOfRecipeDetail createArrayOfRecipeDetail() {
        return new ArrayOfRecipeDetail();
    }

    /**
     * Create an instance of {@link ArrayOfOptinResponse }
     * 
     * @return 
     */
    public ArrayOfOptinResponse createArrayOfOptinResponse() {
        return new ArrayOfOptinResponse();
    }

    /**
     * Create an instance of {@link OptinResponse }
     * 
     * @return 
     */
    public OptinResponse createOptinResponse() {
        return new OptinResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeSummariesResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeSummariesResponse")
    public JAXBElement<RecipeSummariesResponse> createRecipeSummariesResponse(RecipeSummariesResponse value) {
        return new JAXBElement<RecipeSummariesResponse>(_RecipeSummariesResponse_QNAME, RecipeSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeCategoryResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "GetRecipeCategoryResponse")
    public JAXBElement<GetRecipeCategoryResponse> createGetRecipeCategoryResponse(GetRecipeCategoryResponse value) {
        return new JAXBElement<GetRecipeCategoryResponse>(_GetRecipeCategoryResponse_QNAME, GetRecipeCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeClassificationResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "GetRecipeClassificationResponse")
    public JAXBElement<GetRecipeClassificationResponse> createGetRecipeClassificationResponse(GetRecipeClassificationResponse value) {
        return new JAXBElement<GetRecipeClassificationResponse>(_GetRecipeClassificationResponse_QNAME, GetRecipeClassificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeSubCategoryResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "GetRecipeSubCategoryResponse")
    public JAXBElement<GetRecipeSubCategoryResponse> createGetRecipeSubCategoryResponse(GetRecipeSubCategoryResponse value) {
        return new JAXBElement<GetRecipeSubCategoryResponse>(_GetRecipeSubCategoryResponse_QNAME, GetRecipeSubCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeVideosResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeVideosResponse")
    public JAXBElement<RecipeVideosResponse> createRecipeVideosResponse(RecipeVideosResponse value) {
        return new JAXBElement<RecipeVideosResponse>(_RecipeVideosResponse_QNAME, RecipeVideosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ROTDSummariesResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "ROTDSummariesResponse")
    public JAXBElement<ROTDSummariesResponse> createROTDSummariesResponse(ROTDSummariesResponse value) {
        return new JAXBElement<ROTDSummariesResponse>(_ROTDSummariesResponse_QNAME, ROTDSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberRecipeDetailResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "MemberRecipeDetailResponse")
    public JAXBElement<MemberRecipeDetailResponse> createMemberRecipeDetailResponse(MemberRecipeDetailResponse value) {
        return new JAXBElement<MemberRecipeDetailResponse>(_MemberRecipeDetailResponse_QNAME, MemberRecipeDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeDetailResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeDetailResponse")
    public JAXBElement<RecipeDetailResponse> createRecipeDetailResponse(RecipeDetailResponse value) {
        return new JAXBElement<RecipeDetailResponse>(_RecipeDetailResponse_QNAME, RecipeDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatingsPagedResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RatingsPagedResponse")
    public JAXBElement<RatingsPagedResponse> createRatingsPagedResponse(RatingsPagedResponse value) {
        return new JAXBElement<RatingsPagedResponse>(_RatingsPagedResponse_QNAME, RatingsPagedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForgotPasswordCallResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "ForgotPasswordCallResponse")
    public JAXBElement<ForgotPasswordCallResponse> createForgotPasswordCallResponse(ForgotPasswordCallResponse value) {
        return new JAXBElement<ForgotPasswordCallResponse>(_ForgotPasswordCallResponse_QNAME, ForgotPasswordCallResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "LogoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeBoxResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeBoxResponse")
    public JAXBElement<RecipeBoxResponse> createRecipeBoxResponse(RecipeBoxResponse value) {
        return new JAXBElement<RecipeBoxResponse>(_RecipeBoxResponse_QNAME, RecipeBoxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "StatusResponse")
    public JAXBElement<StatusResponse> createStatusResponse(StatusResponse value) {
        return new JAXBElement<StatusResponse>(_StatusResponse_QNAME, StatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeBoxRecipeSummariesResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeBoxRecipeSummariesResponse")
    public JAXBElement<RecipeBoxRecipeSummariesResponse> createRecipeBoxRecipeSummariesResponse(RecipeBoxRecipeSummariesResponse value) {
        return new JAXBElement<RecipeBoxRecipeSummariesResponse>(_RecipeBoxRecipeSummariesResponse_QNAME, RecipeBoxRecipeSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeInRecipeBoxResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeInRecipeBoxResponse")
    public JAXBElement<RecipeInRecipeBoxResponse> createRecipeInRecipeBoxResponse(RecipeInRecipeBoxResponse value) {
        return new JAXBElement<RecipeInRecipeBoxResponse>(_RecipeInRecipeBoxResponse_QNAME, RecipeInRecipeBoxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingListsResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "ShoppingListsResponse")
    public JAXBElement<ShoppingListsResponse> createShoppingListsResponse(ShoppingListsResponse value) {
        return new JAXBElement<ShoppingListsResponse>(_ShoppingListsResponse_QNAME, ShoppingListsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingListResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "ShoppingListResponse")
    public JAXBElement<ShoppingListResponse> createShoppingListResponse(ShoppingListResponse value) {
        return new JAXBElement<ShoppingListResponse>(_ShoppingListResponse_QNAME, ShoppingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortedShoppingListResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "SortedShoppingListResponse")
    public JAXBElement<SortedShoppingListResponse> createSortedShoppingListResponse(SortedShoppingListResponse value) {
        return new JAXBElement<SortedShoppingListResponse>(_SortedShoppingListResponse_QNAME, SortedShoppingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditShoppingListItemResponseNew }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "EditShoppingListItemResponseNew")
    public JAXBElement<EditShoppingListItemResponseNew> createEditShoppingListItemResponseNew(EditShoppingListItemResponseNew value) {
        return new JAXBElement<EditShoppingListItemResponseNew>(_EditShoppingListItemResponseNew_QNAME, EditShoppingListItemResponseNew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItemToShoppingListResponseNew }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "AddItemToShoppingListResponseNew")
    public JAXBElement<AddItemToShoppingListResponseNew> createAddItemToShoppingListResponseNew(AddItemToShoppingListResponseNew value) {
        return new JAXBElement<AddItemToShoppingListResponseNew>(_AddItemToShoppingListResponseNew_QNAME, AddItemToShoppingListResponseNew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeBoxShoppingListResponses }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeBoxShoppingListResponses")
    public JAXBElement<RecipeBoxShoppingListResponses> createRecipeBoxShoppingListResponses(RecipeBoxShoppingListResponses value) {
        return new JAXBElement<RecipeBoxShoppingListResponses>(_RecipeBoxShoppingListResponses_QNAME, RecipeBoxShoppingListResponses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeBoxShoppingListResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeBoxShoppingListResponse")
    public JAXBElement<RecipeBoxShoppingListResponse> createRecipeBoxShoppingListResponse(RecipeBoxShoppingListResponse value) {
        return new JAXBElement<RecipeBoxShoppingListResponse>(_RecipeBoxShoppingListResponse_QNAME, RecipeBoxShoppingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreSummariesResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "StoreSummariesResponse")
    public JAXBElement<StoreSummariesResponse> createStoreSummariesResponse(StoreSummariesResponse value) {
        return new JAXBElement<StoreSummariesResponse>(_StoreSummariesResponse_QNAME, StoreSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoremetricsResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "CoremetricsResponse")
    public JAXBElement<CoremetricsResponse> createCoremetricsResponse(CoremetricsResponse value) {
        return new JAXBElement<CoremetricsResponse>(_CoremetricsResponse_QNAME, CoremetricsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoRecipeSummariesResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "VideoRecipeSummariesResponse")
    public JAXBElement<VideoRecipeSummariesResponse> createVideoRecipeSummariesResponse(VideoRecipeSummariesResponse value) {
        return new JAXBElement<VideoRecipeSummariesResponse>(_VideoRecipeSummariesResponse_QNAME, VideoRecipeSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTSummariesResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "DTSummariesResponse")
    public JAXBElement<DTSummariesResponse> createDTSummariesResponse(DTSummariesResponse value) {
        return new JAXBElement<DTSummariesResponse>(_DTSummariesResponse_QNAME, DTSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeSubCategoryResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeSubCategoryResponse")
    public JAXBElement<RecipeSubCategoryResponse> createRecipeSubCategoryResponse(RecipeSubCategoryResponse value) {
        return new JAXBElement<RecipeSubCategoryResponse>(_RecipeSubCategoryResponse_QNAME, RecipeSubCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PollDetailsResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "PollDetailsResponse")
    public JAXBElement<PollDetailsResponse> createPollDetailsResponse(PollDetailsResponse value) {
        return new JAXBElement<PollDetailsResponse>(_PollDetailsResponse_QNAME, PollDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteUserAcctPointsLeftResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "SiteUserAcctPointsLeftResponse")
    public JAXBElement<SiteUserAcctPointsLeftResponse> createSiteUserAcctPointsLeftResponse(SiteUserAcctPointsLeftResponse value) {
        return new JAXBElement<SiteUserAcctPointsLeftResponse>(_SiteUserAcctPointsLeftResponse_QNAME, SiteUserAcctPointsLeftResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeSummaryDetailsResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeSummaryDetailsResponse")
    public JAXBElement<RecipeSummaryDetailsResponse> createRecipeSummaryDetailsResponse(RecipeSummaryDetailsResponse value) {
        return new JAXBElement<RecipeSummaryDetailsResponse>(_RecipeSummaryDetailsResponse_QNAME, RecipeSummaryDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeDetailResponses }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeDetailResponses")
    public JAXBElement<RecipeDetailResponses> createRecipeDetailResponses(RecipeDetailResponses value) {
        return new JAXBElement<RecipeDetailResponses>(_RecipeDetailResponses_QNAME, RecipeDetailResponses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptinSummaryResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "OptinSummaryResponse")
    public JAXBElement<OptinSummaryResponse> createOptinSummaryResponse(OptinSummaryResponse value) {
        return new JAXBElement<OptinSummaryResponse>(_OptinSummaryResponse_QNAME, OptinSummaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpadteUserAnswerResponse }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "UpadteUserAnswerResponse")
    public JAXBElement<UpadteUserAnswerResponse> createUpadteUserAnswerResponse(UpadteUserAnswerResponse value) {
        return new JAXBElement<UpadteUserAnswerResponse>(_UpadteUserAnswerResponse_QNAME, UpadteUserAnswerResponse.class, null, value);
    }

}
